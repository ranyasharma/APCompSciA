public class IntSortPrac
{
    
    public static void main (String [] args)
    {
     int [] array = new int [10];
    for (int i=0; i< 10; i++)
    {
            array[i] = (int)(Math.random()*9) +2;
    }
    System.out.println("This is the unsorted array:");  
    for (int x:array)
    System.out.print (x + " ");
    
    for (int j:array)
    {
      while (array [j] > array [j+1] && j<9)
    {
       int n; 
       n = array [j];
       array [j] = array [j+1];
       array [j+1] = n;
       
    }
    j++;
}

    System.out.println("This is the sorted array:");
    for (int x:array)
    System.out.print (x + " ");

}
}
