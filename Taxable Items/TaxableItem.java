public abstract class TaxableItem implements Item
{
    private double taxRate;
    
    public abstract double getListPrice();
    
    public TaxableItem(double rate)
    {
        taxRate = rate;
    }
    
    // returns the price of the item including the tax
    
    public double purchasePrice()
    {
        double purchase;
        purchase = getListPrice() + (getListPrice() * taxRate);
        return purchase;
    }
}
