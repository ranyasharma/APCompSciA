
/**
 * Write a description of class Point here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class Point
 {
    private int x, y;
    
    public Point()
    {
        this(0,0);
    }
    
    public Point(int xvalue, int yvalue)
    {
        x = xvalue;
        y = yvalue;
    }
    
    public void setPoint(int xvalue, int yvalue)
    {
        x = xvalue;
        y = yvalue;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public String toString()
    {
        String str;
        str = ("(" + x + "," + y + ")");
        return str; 
    }
    
    public double getDistanceFromOrigin()
    {
        double DistanceFromOrigin;
        DistanceFromOrigin = Math.sqrt ((x * x) + (y * y));
        return DistanceFromOrigin;
    }
    
}


