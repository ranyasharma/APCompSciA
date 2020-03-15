
/**
 * Print squares and cubes of the first 10 positive odd integers.
 * Print a single line of the first 10 positive even integers in 
 * descending order. You must use a loop.
 *
 * @Ranya Sharma 
 * @9/17/19
 */

public class Digits
{
    public static void main (String args [])
    {
        for(int a = 1; a<=19; a+=2)
       {
           System.out.println (a + "\t" + a*a + "\t" + a*a*a);
           System.out.println(); //inserting blank line for the a e s t h e t i c
       }
       for (int x = 20; x>=2; x-=2)
       {    System.out.print ( x );
       }
}
}




