/*
 * Assignment1 for CS313 Spring 2017
 * Edge Class
 * 
 */

public class Edge
{
	//Private Variables
  private int adjacentVertex;

  //Constructor
  public Edge(int w)
  {
	  adjacentVertex = w;
  }

  //Sets adjacentVertex
  public void setAdjacentVertex(int i)
  {
	  adjacentVertex = i;
  }

  //Returns adjacentVertext
  public int getAdjacentVertex()
  {
	  return adjacentVertex;
  }
}