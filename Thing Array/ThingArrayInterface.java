public interface ThingArrayInterface
{
    // returns the name of this ThingArray
    String getName();

    // returns the logical size of this ThingArray
    int getSize();    
    
    // returns true if this list contains no elements
    boolean isEmpty();
    
    // returns true if this list is completely full
    boolean isFull();

    // appends the specified element to the end of this list
    void add(Thing element);
  
    // returns the element at the specified position in this list
    Thing get(int index);
    
    // returns the index of the first occurance of the specified element
    // in this list, or -1 if this list does not contain the element
    int indexOf(Thing element);
    
    // returns true if this list contains the specified element
    boolean contains(Thing element);
    
    // returns a formatted string representation of this ThingArray
    String toString();
    
    // replaces the element at the specified position in this list
    // with the specified element
    Thing set(int index, Thing element);
    
    // inserts the specified element at the specified position in this list
    void add(int index, Thing element);
    
    // removes the element at the specified position in this list
    Thing remove(int index);
    
    // removes the first occurance of the specified element from this
    // list, if it is present
    boolean remove(Thing element);
    
    // removes all of the elements from this list
    void clear();    
    
    // sort all of the elements in the list in ascending order
    void sort();
}
