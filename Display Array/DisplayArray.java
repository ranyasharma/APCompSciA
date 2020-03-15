public class DisplayArray
{
   public static void main (String [] args)
    {
        double [] number = new double [10] ;//declaring an array 
         number = new double [10]; //instantiating the array of size 10
         number[0] = 12;
         number[1] = 15;
         number[2] = 34;
         number[3] = 11;
         number[4] = 17;
         number[5] = 23;
         number[6] = 25;
         number[7] = 55;
         number[8] = 54;
         number[9] = 72;
         double sum = 0;
         
         for (int i = 0; i < number.length; i++)
         { System. out.println (number[i] + " ");
            }
         System.out.println();    
         
         for (int i = number.length-1; i >= 0; i--)
         { System. out.println (number[i] + " ");
            }
        System.out.println();  
         for (int i = 0; i < number.length; i++)
         {
             
             sum = sum + number[i];
         }
         System.out.print(sum);
         System.out.println();  
         
        System.out.println(number.length);
        
        
         
        }
    }
