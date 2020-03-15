

/**
 * Ask the user for number of rows and columns in a matrix, then display
 * ordered pairs of matrix in regular order AND reverse order. 
 *
 * @author (Ranya Sharma)
 * @version (September 30, 2019)
 */
import java.util.Scanner;
public class matrix
{  
  public static void main (String [] args){
        int rows;
        int columns; 
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter number of rows");
        rows = reader.nextInt();
        System.out.println(" Enter number of columns");
        //get input and basically plug it into matrix 
        columns = reader.nextInt();
        
        for (int y = 0; y < rows; y++)
        { 
            for (int x = 0 ; x < columns; x++)
            {
                System.out.print("(" + x + " , " + y + " ) " + "\t" );
            }
            System.out.println();//return to start a new row 
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int y = rows-1; y>=0 ; y--)//start with last row number
        { 
            for (int x = columns-1 ; x>=0; x--)//start with last column number
            {
                System.out.print("(" + x + " , " + y + " ) " + "\t" );
            }
            System.out.println();//return to start a new row 
        }
        
    }
}
