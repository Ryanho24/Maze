import java.util.Iterator;

/*
 * Assignment1 for CS313 Spring 2017
 * Vertex Class
 * 
 */

public class Vertex
{
	//Private Variables
  private String name;
  private int x;
  private int y;
  private DoublyLinkedList<Edge> edges;

  //Constructs Vertex object and sets data
  public Vertex(String n, int xCoord, int yCoord)
  {
	  name = n;
	  x = xCoord;
	  y = yCoord;
	  edges = new DoublyLinkedList<Edge>();
  }

  //Sets name
  public void setName(String n)
  {
	  name = n;
  }

  //Returns name
  public String getName()
  {
	  return name;
  }

  //Sets xCoordinate
  public void setXCoord(int xCoord)
  {
	  x = xCoord;
  }

  //Returns xCoordinate
  public int getXCoord()
  {
	  return x;
  }

  //Sets yCoordinate
  public void setYCoord(int yCoord)
  {
	  y = yCoord;
  }

  //Returns yCoordinate
  public int getYCoord()
  {
	  return y;
  }

  //Adds edge to array of edges
  public void addEdge(Edge e)
  {
	  edges.add(e);
  }

  //Returns Iterator of Edges
  public Iterator<Edge> getEdgesIterator()
  {
	  return edges.iterator();
  }
}