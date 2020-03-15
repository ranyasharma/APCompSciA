public class SubstringCounter
{
    public static int substringCounter(String string, String substring)
    {
        int startPos = 0;//location of pointer
        int count = 0;//number of time "substring" occurs in "string"
        //continue until pointer is beyond last character in "string"
        while (startPos < string.length())
        {
            //test if "substring" is found in "string" found
            if(string.indexOf(substring,startPos) != -1)
            {
                //"substring" was found, so increase counter 
                count ++;
                //move pointer to the next position in "string"
                startPos = string.indexOf(substring, startPos) +1;
            }
            else 
            //"substring" was not found so return the count
            return count;
        }
        //went through entire "string" so return the coun
        return count;
    }
  
}
