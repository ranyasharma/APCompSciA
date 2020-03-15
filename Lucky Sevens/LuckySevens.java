
/**
 * Write a program that demonstrates the futility of playing Lucky Sevens
 * Simulate the game of lucky sevens until all funds are depleted. 
 * 1) Rules 
 * roll two dice
 * if the sum equals 7, win $4, else lose $1
 * 2) The inputs are 
 * the amount of money the user is preapred to lose
 * 3) Computations:
 * Use the random number generator to simulate rolling the dice
 * Loop until all funds are depleted
 * Count the number of rolls
 * Keep track of the maximum amount
 * 4) The outputs are 
 * The number of rolls it takes to deplete the funds
 * The maximum amount 
 * @author (Ranya Sharma)
 * @version (9/23/2019)
 */
import java.util.Scanner;
//import java.util.Random;
public class luckysevens
{
    public static void main (String [] args) {;
        Scanner reader = new Scanner (System.in);
        //Random generator = new Random ();
        Dice d = new Dice();
        
        int die1, die2; //two dice
        int dollars;// initial number of dollars (input)
        int count; //number of rolls to reach depletion
        int maxDollars; //maximum amount held by the gambler
        int countAtMax; //count when the maximum is achieved 
        
        //request the input 
        System.out.print("How many dollars do you have? ");
        dollars = reader.nextInt();
        
        //initialize variables
        maxDollars = dollars;
        countAtMax = 0;
        count = 0;
        
        //loop until the money is gone 
        while (dollars > 0) {
            count++;
            
            //roll the dice
            //die1 = generator.nextInt (6) +1; // 1-6
            die1 = d.roll();
            die2 = d.roll();
            //die2 = generator.nextInt (6) +1; // 1-6
            
            // caculate the winnings or losses 
            if (die1 + die2 == 7) 
            dollars += 4;
            else 
            dollars -= 1;
            
            //if this is  new maximum, remember it 
            if (dollars > maxDollars) {
                maxDollars = dollars;
                countAtMax = count; 
                
            }
        }
        //Display the results 
        System.out.println
        ("You are broke after " + count + " rolls.\n" +
        "You should have quit after " + countAtMax +
        " rolls when you had $" + maxDollars + ".");
        
        
        
        
            
    }
        
}
