import java.util.Scanner;
import java.io.*;

public class ReadingfromaFile
{
    public static void main (String [] Args) throws IOException {
        Scanner readerOne = new Scanner(new File ("numbers.txt"));
        //Task#1
            while (readerOne.hasNext()){ //there is data to scan
                System.out.print (readerOne.nextInt() + "\t");
            }
            readerOne.close();
            System.out.println();
            System.out.println();
        Scanner readerTwo = new Scanner(new File ("numbers.txt"));
        //Task#2
        /*
        int x;
        int y;

        x = readerTwo.nextInt();
        y = readerTwo.nextInt();
        System.out.print(Math.max(x,y));
        */
            while (readerTwo.hasNext()) {
                int x;
                int y;
                x = readerTwo.nextInt();
                y = readerTwo.nextInt();
                if (x > y) {
                    System.out.print(x + "\t" );

                }
                else {
                      System.out.print(y + "\t");
                }


            }


    }
}

