public class Vehicle extends TaxableItem
{
    private double c;
    private double mark;
    
    public Vehicle (double cost, double markup, double taxRate)
    {
        super (taxRate);
        c = cost;
        mark = markup;
       
    }
  
    
    public double getListPrice()
    {
        double price;
        price = c + mark;
        return price;
    }
    
    public void changeMarkup(double value)
    {
        mark = value;
    
    }
    
    
}
