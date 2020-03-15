
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Calculator
{
   private int x, y;
   private static int numInstances = 0;
   public static void main (String [] args)
   {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter number: ");
    int x = reader.nextInt();
    System.out.print("Enter another number: ");
    int y = reader.nextInt();
    Calculator c = new Calculator(x,y);
    System.out.println("Sum=" + c.Sum());
    System.out.println("Difference=" + c.Difference());
    System.out.println("Mutiply=" + c.Multiply());
    System.out.println("Divide=" + c.Divide());
    System.out.println("Instance=" + numInstances);
    System.out.println("");
    Calculator c1 = new Calculator(x+1,y+1);
    System.out.println("Sum=" + c1.Sum());
    System.out.println("Difference=" + c1.Difference());
    System.out.println("Mutiply=" + c1.Multiply());
    System.out.println("Divide=" + c1.Divide());
    System.out.println("Instance=" + numInstances);
    System.out.println("");
    Calculator c2 = new Calculator(x+2,y+2);
    System.out.println("Sum=" + c2.Sum());
    System.out.println("Difference=" + c2.Difference());
    System.out.println("Mutiply=" + c2.Multiply());
    System.out.println("Divide=" + c2.Divide());
    System.out.println("Instance=" + numInstances);
    System.out.println("");
    highSchoolStudent s1= new highSchoolStudent(101, "Rhea");
    s1.display();
    highSchoolStudent s2 = new highSchoolStudent(102, "Ranya");
    s2.display();
    s1.display();
   }
   
   public Calculator (int xvalue, int yvalue)
    {
        x = xvalue;
        y = yvalue;
        numInstances = numInstances + 1;
    } 
   
    public int Sum()
    {
        int sum;
        sum = x + y;
        return sum;
    }
    
    public int Difference()
    {
        int difference;
        difference = x - y;
        return difference;
    }
    
    public int Multiply()
    {
        int multiply;
        multiply = x * y;
        return multiply;
    }
    
    public int Divide()
    {
        int divide;
        divide = x/y;
        return divide; 
    }

}

