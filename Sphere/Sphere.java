import java.util.Scanner;
import java.lang.Math.*;
public class Sphere
{
     public static void main (String [] args){//main method header "signature"
    Scanner reader = new Scanner(System.in);
    double radius; // radius
    double diameter;// diameter
    double circumference; //
    double surfacearea; // surface area
    double volume; // volume



    System.out.print(" Enter radius length;");// ask for value for decimal
        radius = reader.nextDouble();// grabbing value from keyboard and
                                      // putting in "number variable
        diameter = 2 * radius;// 
        circumference = 2 * Math.PI * radius;
        surfacearea = 4 * Math.PI * radius * radius;
        volume = (4.0/3) * Math.PI * radius * radius * radius;


        System.out.print("The diameter of the sphere is ");// displaying results
        System.out.println(diameter);
        System.out.print("The circumference of the sphere is ");
        System.out.println(circumference);
        System.out.print("The surface area of the sphere is ");
        System.out.println(surfacearea);
        System.out.print("The volume of the sphere is ");
        System.out.println(volume);



}
}
