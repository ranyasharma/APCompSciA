public class ArrayStats
{
    public static double findMean(int[] a)
    {
       double sum = 0;
       for (int i = 0; i < a.length; i++)
         {
             
             sum = sum + a[i];
         }
       
       double mean;
       mean = sum / a.length ;
       return mean;
         
    }
    
    public static int findMedian(int[] a)
    {
        int median;
        median = a.length / 2;
        return a[median];
    }
    
    public static int findMode(int[] a)
    {
        int index = 0;
        int soFar = 1;
        int count = 1;
        for (int k = 1; k < a.length; k++)
        {
            if (a[k-1] == a[k])
            {
                count++;
                if (count > soFar)
                {
                    soFar = count;
                    index = k;
                }
            }
            else 
            { 
                count = 1;
            }
        }
        return a[index];
    }
        
        
        
    }
    

