

public class MultipleGroups implements NumberGroup
{ 
    //instance variables
    private NumberGroup[] groupList;
    //constructor to initialize instance variables
    public MultipleGroups(NumberGroup[] x)
    {
        groupList = x;
    }
    
    //contains method 
    //check the elements in the array; if any element contains the parameter. 
    //return true; if no element 
    public boolean contains (int x)
    {
        for (int i= 0; i< groupList.length; i++)
        {
            if (groupList[i].contains(x))
            {
                return true;
            }
            
        }
        return false;
            
    }
    
}
