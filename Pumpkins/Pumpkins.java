public class Pumpkin
{
    //FIRST SECTION: INSTANCE  VARIABLES
    //instance variables ALWAYS private
    //characteristics of all pumpkins
    private int weight;
    private String color;
    private int diameter;
    private boolean haveSeeds;
    
    //SECOND SECTION: CONSTRUCTOR METHOD
    //purpose: assign values to instance variables
    //always have same name as class
    
    public Pumpkin()
    {
        weight = 35;
        color = "orange";//use quotes with Strings
        diameter = 18;
        haveSeeds = true;
        
    }
    public Pumpkin(int w, String c, int d, boolean x)
    {   // ORDER MATTERS!! JAVA IS NOT A CALCULATOR
        // instance variable = parameter 
        weight = w;
        color = c;
        diameter = d;
        haveSeeds = x;
    }
    
    //THIRD SECTION: SETTER METHODS
    //change the values of the instance variables after the instantiation of 
    //the object 
    //don't return anything..."void"
    
    public void setWeight( int x)
    {
        weight = x;
    }
    public void setColor (String x)
    {
        color = x;
    }
    public void setDiameter (int x)
    {
        diameter = x;
    }
    public void setHaveSeeds (boolean x)
    {
        haveSeeds = x;
    }
    
    //SECTION FOUR: GETTER METHODS 
    //returns stuff 

}
