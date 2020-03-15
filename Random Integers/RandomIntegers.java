public class RandomIntegers
{
   /* returns a random integer from 0 to n - 1
    * @param n the upper limit (exclusive)
    * Precondition: n > 0
    * @return a random integer from 0 to n - 1
    */
    public static int randomInteger(int n)
    {
        int x = (int)(Math.random() * n);
        return x;
        
    }
    
   /* returns a random integer from start to end (inclusive)
    * @param start the lower limit of random numbers (inclusive)
    * @param end the upper limit of random numbers (inclusive)
    * Precondition: 0 <= start <= end
    * @return a random integer from start to end (inclusive)
    */
    public static int randomInteger(int start, int end)
    {
        int y = (int)(Math.random() * ((end - start) +1) + start);
        return y;
    }
    
   /* returns an array with a capacity of length
    * of random integers from 0 to n - 1
    * @param length the length of the returned array
    * @param n the upper limit (exclusive)
    * Precondition: length > 0, n > 0
    * @return an array of random integers from 0 to n - 1
    */
    public static int[] randomIntegerArray(int length, int n)
    {
        int [] a;
        a = new int [length];
        for (int i = 0; i < a.length; i++)
        {
        a[i] = (int)(Math.random() * n);
    }
        
    return a;
    
        
    }
}
