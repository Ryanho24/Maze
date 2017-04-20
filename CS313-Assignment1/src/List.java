import java.util.Iterator;

/*
 * Assignment1 for CS313 Spring 2017
 * Given interface of List
 * 
 */

public interface List<AnyType>
{
  void clear();
  
  int size();

  boolean isEmpty();

  AnyType get(int index);

  AnyType set(int index, AnyType newValue);

  boolean add(AnyType newValue);

  void add(int index, AnyType newValue);

  AnyType remove(int index);

  Iterator<AnyType> iterator();
}