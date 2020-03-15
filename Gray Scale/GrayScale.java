import images.APImage;
import images.Pixel;
import java.util.Scanner;

/**
 * Write a description of class GrayScale here.
 *
 * @author (Ranya Sharma)
 * @version (
 */
public class GrayScale
{
    public static void main (String [] args)
   {
    Scanner reader = new Scanner(System.in);
    APImage image = new APImage("smokey.jpg");//image being converted 
    image.draw();//displays image before
    for(Pixel p : image)
    {
        int red = p.getRed();//grab red value from the pixel 
        int green = p.getGreen();//grab green value from the pixel 
        int blue = p.getBlue();//grab blue value from the pixel 
        int average = (red + green + blue) / 3;//calculate average
        //change values of the pixel's RGB values 
        p.setRed(average);
        p.setGreen(average);
        p.setBlue(average);

    }
    
System.out.print("Press Enter to continue");
reader.nextLine();
image.draw();//display new image 
}
}
