/**
 * Shell class for 3.04 Project ("Fraction")
 * Represents fractions and fraction arithmetic
 * 
 * @Ranya Sharma  (put your name here)
 * @October 15 (put the date here)
 */

public class Fraction 
{
   //declare instance variables
   private int numer,denom;
   
   //default constructor with no parameters
   public Fraction()
   {
      this (1, 1);   //this constructor chains the following constructor
   }

   //additional constructor establishes the values of the numerator and denominator
   public Fraction(int n, int d)
   {
      numer = n;
      denom = d;
   }

   //returns the numerator of the fraction
   public int getNumerator()
   {
      return numer;
   }

   //returns the denominator of the fraction
   public int getDenominator()
   {
      // complete the following line
      return denom;
   }

   //returns the default string description of the fraction
   //(in the form 'numerator/denominator')
   public String toString()
   {
      String str;
      str = numer + "/" + denom;
      return str;
   }

   //method for multiplying two fractions (without simplifying the result)
   public Fraction multiply(Fraction other)
   {
      // n1   n2   n1(n2)
      // -- * -- = ------
      // d1   d2   d1(d2)

      // <insert code here>
      int numer2 = other.getNumerator ();
      int denom2 = other.getDenominator ();
      int x = numer * numer2;
      int y = denom * denom2;
      
      return new Fraction(x,y).simplify();
   }

   //method for dividing two fractions (without simplifying the result)
   public Fraction divide(Fraction other)
   {
      // n1   n2   n1(d2)
      // -- / -- = ------
      // d1   d2   d1(n2)

      int numer2 = other.getNumerator ();
      int denom2 = other.getDenominator ();
      int x = numer * denom2;
      int y = denom * numer2;
      
      return new Fraction(x, y).simplify();
   } 
   
   //method for adding two fractions (without simplifying the result)
   public Fraction add(Fraction other)
   {
      // n1   n2   n1(d2) + n2(d1)
      // -- + -- = ---------------
      // d1   d2        d1(d2)
      
      int numer2 = other.getNumerator ();
      int denom2 = other.getDenominator ();
      int x = numer * denom2 + numer2 * denom;
      int y = denom * denom2;
      return new Fraction(x, y).simplify();
   }

   //method for subracting two fractions (without simplifying the result)
   public Fraction subtract(Fraction other)
   {
      // n1   n2   n1(d2) - n2(d1)
      // -- - -- = ---------------
      // d1   d2        d1(d2)

      int numer2 = other.getNumerator ();
      int denom2 = other.getDenominator ();
      int x = numer * denom2 - numer2 * denom;
      int y = denom * denom2;
      return new Fraction(x, y).simplify();
   }
   
   public Fraction simplify()
   {int larger = 0;
   int smaller = 0;
        if (numer>denom)
        {
            larger = numer; //asign value of "a" to "larger"
            smaller = denom; //asign value of "b" to "smaller
        }
        else
        {
            larger = denom; //asign value of "b" to "larger"
            smaller = numer; //assign value of "a" to "smaller"
        }
        
        while (smaller!=0)
        {
            int remainder = larger%smaller;
            larger = smaller;
            smaller = remainder;
        }
        
        return new Fraction (numer/larger, denom/larger);
    }
}

