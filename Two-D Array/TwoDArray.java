public class TwoDArray
{
   public static void main (String [] args)
   {
       int [] [] table = new int [7] [5];//declare and instantiate a 2d 
       //array with 5 columns and 7 rows 
       for (int i = 0; i < table.length; i++)
       {
           for (int j = 0; j < table[i].length; j++) 
           {
               table [i] [j] = (int) (Math.random()* 51 + 50);
               System.out.print(table [i] [j] + " ");
           }
           System.out.println();
        }
        
       
       int [] rowSum = new int [7];
       
       for (int i = 0; i < table.length; i++)
       {
           for (int j = 0; j < table[i].length; j++)
           {
               rowSum [i] += table [i] [j];
               
            }
            double average = rowSum[i] / table[i].length;
            System.out.println ("The average of row" + " " + i + " " + "is" 
            + " " + average);
            
        }
        
}
}
