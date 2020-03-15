
/**
 * This is a dummy class designed to complete a UML diagram
 */
public class NonTaxableItem implements Item
{
    private double dealerCost;
    private double dealerMarkup;
    
    public NonTaxableItem (double cost, double markup)
    {
        dealerCost = cost;
        dealerMarkup = markup;
    }
    
        public double purchasePrice()
    {
        return getListPrice();
    }

    public double getListPrice()
    {
        return dealerCost + dealerMarkup;
    }
    
    public void changeMarkup(double markup)
    {
        dealerMarkup = markup;
    }
    
}
