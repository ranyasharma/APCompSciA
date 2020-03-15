import java.util.Scanner;

public class Cube
{
      public static void main (String [] args){//main method header "signature"
    Scanner reader = new Scanner(System.in);
    double side; // side length
    double cubed; // cube volume

    System.out.print(" Enter side length;");// ask for value for decimal
        side = reader.nextDouble();// grabbing value from keyboard and
                                      // putting in "number variable
        cubed = 6 * side * side;// "round" the decimal
        System.out.print("The volume of the cube is ");// displaying results
        System.out.println(cubed);


}
