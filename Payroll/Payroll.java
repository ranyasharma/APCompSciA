import java.util.Scanner;
import java.lang.Math.*;
public class Payroll
{
     public static void main (String [] args){//main method header "signature"
    Scanner reader = new Scanner(System.in);
    double hourlywage; 
    double regularhours;
    double overtimehours; 
    double overtimepay; 
    double weeklywage; 
    System.out.print("Enter hourly wage");// ask for value for decimal
        hourlywage = reader.nextDouble();// grabbing value from keyboard and

    System.out.println("Enter regular hours");
        regularhours = reader.nextDouble();

    System.out.println("Enter overtime hours");
        overtimehours = reader.nextDouble();

        overtimepay = overtimehours * (1.5 * hourlywage);
        weeklywage = (hourlywage * regularhours) + overtimepay;

        System.out.print("The weekly wage is ");
        System.out.println(weeklywage);




}
}
