public class Thing implements Comparable
{
    private int amount;
    public Thing (int x)
    {
        amount = x;
    }
    
    public int getAmount()
    {
        return amount;
    }
    
    public int compareTo(Object o)
    {
        Thing other = (Thing)(o);
        return amount - other.getAmount();
        
    }
    
    public boolean equals(Thing z)
    {
        if (this.compareTo(z)==0)
        {
            return true;
        }
        
        return false;
    }
    
    public String toString()
    {
        return "Thing amount " + amount + "\n";
    }
}
