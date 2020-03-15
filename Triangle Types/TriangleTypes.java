
/**
 * This class classifies various triangle types
 *
 * @Ranya Sharma 
 * @September 27, 2019  
 */
public class TriangleTypes
{
    // returns true if this is a Right triangle, false if not
    public static boolean isRight(int a, int b, int c)
    {
        if ((a*a)+(b*b) == (c*c)){
            return true;
        }
         if ((b*b)+(c*c) == (a*a)){
            return true;
        }
         if ((c*c)+(a*a) == (b*b)){
            return true;
        }
            return false;   // rewrite this statement
    }

    
    // returns true if this is an Equilateral triangle, false if not
    public static boolean isEquilateral(int a, int b, int c)
    {
        if (a==b) {
        if (b==c)
        if (c==a)
        return true;
    }
        return false;   // rewrite this statement
    }

    
    // returns true if this is an Isoceles triangle, false if not
    public static boolean isIsoceles(int a, int b, int c)
    {
        if (a==b) {
            return true;
        }
        if (b==c) {
            return true;
        }
        if (a==c) {
            return true;
        }
        return false;   // rewrite this statement
    }
    
    // returns true if this is a Scalene triangle, false if not
    public static boolean isScalene(int a, int b, int c)
    {
        if (a!=b) {
        if (b!=c)
        if (c!=a)
        return true; 
    }
        return false;   // rewrite this statement
    }
    
    
    
    
}
