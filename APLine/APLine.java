
/**
 * Write a description of class APLine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class APLine
{
    private int avalue, bvalue, cvalue;
    
    public APLine(int a, int b, int c)
    {
        avalue = a;
        bvalue = b;
        cvalue = c;
    }
    
    public double getSlope()
    {
        double slope;
        slope = (-1.0 * avalue) / bvalue;
        return slope;
    }
    
    public boolean isOnLine(int x, int y)
    {
        if ((avalue * x) + (bvalue * y) +cvalue == 0)
        return true;
        else 
        return false;
    }
}
    
    
    
    

