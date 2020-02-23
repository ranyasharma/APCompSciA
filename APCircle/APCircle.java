
/**
 * Write a description of class APCircle here.
 *
 * @author Ranya Sharma
 * @version (a version number or a date)
 */
public class APCircle
{
    private int hvalue, kvalue, radius;
    
    public APCircle(int h, int k, int r)
    {
        hvalue = h;
        kvalue = k;
        radius = r;
    }
    
    public double getArea()
    {
        double area; 
        area = Math.PI * radius * radius;
        return area;
    }
    
    public boolean isOnCircle (int x, int y)
    {
        if  ((x-hvalue)*(x-hvalue) + (y-kvalue)*(y-kvalue)==radius*radius)
        return true;
        else 
        return false;
    } 
}
