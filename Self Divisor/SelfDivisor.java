public class SelfDivisor
{
    public static boolean isSelfDivisor(int number)
{
  int num = number;
  while (num > 0)
  {
      int ones = num % 10;
      if (ones == 0 || number % ones != 0)
      {
          return false;
        }
        
      num = num/10;
      
     
}
    return true;
}


public static int[] firstNumSelfDivisors(int start, int num)

   {
       int [] array = new int [num];
       int index = 0;
       int st = start;
       
       while (index < num)
       {
           if (isSelfDivisor (start))
           {
               array [index] = start;
               index ++;
            }
            start ++;
            
        }
       return array;

   }
}
