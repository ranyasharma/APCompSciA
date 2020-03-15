import java.util.Scanner;
public class Fibonacci
{
    // complete the following method
     
    public static int calculate(int n)
    {
        int fib = 1;
        int a = 1;
        int b = 1;
        int count = 3;
        
        while (count <= n) 
        {fib = a + b;
        a = b;
        b = fib;
        count = count+1;
        
    }
    return fib;
    }
