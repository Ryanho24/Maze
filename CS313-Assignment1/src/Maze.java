import java.util.ArrayList;
import java.util.Iterator;

/*
 * Assignment1 for CS313 Spring 2017
 * Maze Class
 * Uses file to create maze
 * Uses Vertex class
 * 
 */

public class Maze
{
  private Vertex[] rooms;

  public Maze(String filename)
  {
    FileRead mazeFile = new FileRead(filename);
    //Checks if file is found
    if(mazeFile.getFileCheck() == false){
    	System.out.println("File not found.");
    }
    else{
    	//Get the String data of the maze
    	ArrayList<String> mazeData = mazeFile.getMazeData();
    	//First line is the number of rooms
    	int numOfRooms = Integer.parseInt(mazeData.get(0));
    	rooms = new Vertex[numOfRooms];
    	//Fill in the rooms array
    	for(int i = 1; i<numOfRooms+1; i++)
    	{
    		String room = mazeData.get(i);
    		String[] roomData = room.split(" ");
    		Vertex roomFound = new Vertex(roomData[0], Integer.parseInt(roomData[1]), Integer.parseInt(roomData[2]));
    		rooms[i-1] = roomFound;
    	}
    	//Edges/corridors
    	//While loop that continues until a string with -1 -1 is found
    	int counter = numOfRooms+2;
    	String edge = mazeData.get(counter);
    	String[] edgeData = edge.split(" ");
    	while((edgeData[0].equals("-1") && edgeData[1].equals("-1")) == false)
    	{
    		//Empty line
    		if(edge==null){
    			counter++;
    			edge = mazeData.get(counter);
    			edgeData = edge.split(" ");
    		}
    		//Invalid edge
    		else if(Integer.parseInt(edgeData[0])>numOfRooms-1 || Integer.parseInt(edgeData[0])<0)
    		{
    			counter++;
    			edge = mazeData.get(counter);
    			edgeData = edge.split(" ");
    		}
    		else if(Integer.parseInt(edgeData[1])>numOfRooms-1 || Integer.parseInt(edgeData[1])<0)
    		{
    			counter++;
    			edge = mazeData.get(counter);
    			edgeData = edge.split(" ");
    		}
    		else
    		{
    			Edge edgeFound = new Edge(Integer.parseInt(edgeData[1]));
    			rooms[Integer.parseInt(edgeData[0])].addEdge(edgeFound);
    			counter++;
    			edge = mazeData.get(counter);
    			edgeData = edge.split(" ");
    		}
    	}
    }
  }

  public Vertex[] getRooms()
  {
	  return rooms;
  }

  public String toString()
  {
	  String mazeCompleted = "";
	  mazeCompleted = rooms.length + "\n";
	  for(int i = 0; i<rooms.length; i++)
	  {
		  mazeCompleted += rooms[i].getName() + " " + rooms[i].getXCoord() + " " + rooms[i].getYCoord() + "\n";
	  }
	  mazeCompleted += "\n";
	  for(int i = 0; i<rooms.length; i++)
	  {
		  Iterator edgeList = rooms[i].getEdgesIterator();
		  while(edgeList.hasNext())
		  {
			  Edge edges = (Edge) edgeList.next();
			  mazeCompleted += i + " " + edges.getAdjacentVertex() + "\n";
		  }
	  }
	  mazeCompleted += "-1 -1";
	  return mazeCompleted;
  }
}