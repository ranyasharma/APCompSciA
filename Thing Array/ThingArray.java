public class ThingArray implements ThingArrayInterface
{
    private String name;
    private Thing [] list = new Thing [4];
    private int size;
   public ThingArray(String n)
   {
       name = n;
       size = 0;
    }
   
   public String getName()
   {
       return name;
   }
    
   public int getSize()
   {
       return size;
    }
    
   public boolean isEmpty()
   {
       if (size == 0)
       {
           return true;
        }
        
       return false;
   
    }
    
   public boolean isFull()
   { if (size == list.length)
       {
           return true;
        }
        
        return false;
    }
    
   public void add(Thing element)
   {
       checkSize();
       list[size] = element; 
       size++;
   }
   
   public Thing get(int index)
   {
       return list[index];
    }
    
   public int indexOf(Thing element)
   {
       for (int i=0; i<size; i++)
       {
           if (list [i] != null && list[i].equals (element))
           {
               return i;
           }
           
        }
        return -1;
    }
  
  
  public boolean contains(Thing element)
  {
      
     for (int i=0; i<size; i++)
     {
         if (list[i].equals (element))
         {
             return true; 
         }
        }
        return false;
    }
      
   public String toString()
   {
     String result = "ThingArray: " + name + "\n";
     for (int i = 0; i < size; i++)
     {
         result += (i) + "." + list[i] + "\n";
        }
        
        return result; 
}
    
 public Thing set(int index, Thing element)
  {
      Thing x;
      x = list [index];
      list [index] = element;
      return x;
    }
  
  private void checkSize()
  {
      int newSize; 
      if (isFull())
      
        newSize = list.length * 2;
    
      else if (size < list.length / 4)
      
          newSize = list.length / 2;
        
        
    else 
    
        return;
    
    
    Thing [] temp = new Thing [newSize];
    for (int i = 0; i < size; i++)
    {
        temp[i] = list[i];
    }
    list = temp;
  }
    
  public void add(int index, Thing element)
   {
      checkSize();
       for (int i=size; i > index; i--)
      {
          list [i] = list [i-1];
      }
      size++;
      list [index] = element;
      //size++;
    }
   
    public Thing remove(int index)
    {
        Thing RemovedElement = list [index];
        size--;
        for (int i = index; i <size ; i++)
        {
            list [i] = list [i+1];
        }
        
        list [size] = null;
        checkSize();
        return RemovedElement;
    }
     
    public boolean remove(Thing element)
     {
         if (indexOf(element)==-1)
         {
             return false;
            }
            
            else 
            {
                remove (indexOf(element));
            }
            
            return true;
         
        }
        
    public void clear()
    {
        while (size > 0)
        {
        remove (0);
    }
    }
        
    public void sort()
        {
            int k=0;
            boolean swapped = true;
            while ((k < size -1) && swapped)
            {
                swapped = false;
                k++;
                for (int j = 0; j <size -k; j++)
                {
                    if (list [j].compareTo(list[j+1]) > 0)
                    {
                        Thing temp = list [j];
                        list [j] = list [j+1];
                        list [j+1] = temp;
                        swapped = true;
                    }
                }
            }
                        
           
        }
     
}
