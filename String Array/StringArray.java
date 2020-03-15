public class StringArray
{
    public static int numInArray( String [] a, String s)
    {
        //declare and initialize counter 
        //iterate through the array, comparing each element in "a" to "s", 
        //if true, increment counter 
        //return counter 
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i].equals(s))
            {
             count ++;
        }
    }
    return count;
}

public static String listAllNums(String [] a, String[] b)
    {
       //use numInArray to determine how many times an element in "a" occurs
       //in array b 
       //print out in specified format what numInArray returns 
       String str = "";
       for (int k = 0; k < a.length; k++)
       {
           String s = a[k];
           int number = numInArray (b, s);
           str = str + s + ": " + number + "\n";
        }
        return str;
    }
}
