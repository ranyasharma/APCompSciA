
/**
 * Write a description of class FlippedImage here.
 * Read graphic image file
 * Create a new graphic image that is flipped upside down (and left-to-right).
 * 
 * @author (Ranya Sharma)
 * @version (October 1, 2019) 
 */
import images.APImage;
import images.Pixel;
import java.util.Scanner;
public class FlippedImage
{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);//reads in the file image
        APImage image = new APImage("smokey.jpg");//disply original image
        image.draw();//shows original image 
        
        int width = image.getWidth();
        int height = image.getHeight();
        
        APImage flippedImage = new APImage(width, height);
        
        int newY = 0; //which row to start in 
        
        for (int y = height-1; y>=0 ; y--)
        { 
            int newX=0;//which column to start in 
       
            for (int x = width-1 ; x>=0; x--)//start with last column number
            {
                Pixel p = image.getPixel(x, y);//gets pixel from image
                flippedImage.setPixel(newX, newY, p.clone());//clones each pixel
                newX++;//moves one to the columns
            }
            newY++;//moves one to the rows
            
     
        
       }
       System.out.println("Press Enter to flip image");
       reader.nextLine();
       flippedImage.draw();  //prints out flipped image
    
    }
    
}
