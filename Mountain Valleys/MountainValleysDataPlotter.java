import java.awt.*;
import java.io.*;
import java.util.*;

/**
 * This DataPlotter object reads a space delimited text file of elevations
 * and plots the result as a range of greyscale images, and then calculates 
 * and plots the steepest downward path from each location in the image.
 * 
 * @author 
 * @version 
 */
public class DataPlotter
{
    private static String fileName = "Colorado";
    private static int[][] grid;
    private static DrawingPanel panel;
    private static Scanner fileReader;
    private static int rows, cols;

    public static void main(String[] args) throws IOException
    {
        readValues();
        plotData();
        try {Thread.sleep(3000); } catch (Exception e){};  // pause display for 3 seconds
        plotAllPaths();
    }

    private static void readValues() throws IOException
    {
        fileReader = new Scanner(new File(fileName + ".dat")); 
        rows = fileReader.nextInt();// first integer in file
        cols = fileReader.nextInt();// second integer in file
        grid = new int [rows][cols];
        for(int r = 0; r<grid.length; r++)
        {
            for(int c = 0; c<grid[r].length; c++)
            {
                grid[r][c] = fileReader.nextInt();
            }
        }
        // instantiate and initialize the instance variable grid 
        // then read all of the data into the array in row major order
        System.out.println(grid[0][0] + "   " + grid[0][cols-1]);
        System.out.println(grid[rows-1][0] + "   " + grid[rows-1][cols-1]);
    }
    // plot the altitude data read from file
    private static void plotData()
    {
        panel = new DrawingPanel(cols, rows);
        int highest = grid[0][0];//sets highest to first value in grid
        int lowest = grid[0][0];//sets lowest to first value in grid 
        for(int r = 0; r<grid.length; r++)
        {
            for(int c = 0; c<grid[r].length; c++)
            {
                if(grid[r][c] > highest)//finds and replaces a value to be the highest value
                {
                    highest = grid[r][c];
                }
            }
        }
        
        for(int r = 0; r<grid.length; r++)
        {
            for(int c = 0; c<grid[r].length; c++)
            {
                if(grid[r][c] < lowest)//finds and replaces a value to be the lowest value 
                {
                    lowest = grid[r][c];
                }
            }
        }
        
        double scale = (255.0/(highest-lowest));//scale value
        panel = new DrawingPanel(cols,rows);
        for(int r = 0; r<grid.length; r++)
        {
            for(int c = 0; c<grid[r].length; c++)//scales the pixel 
            {
                int colorValue;
                colorValue = (int) (((grid[r][c]) - lowest) * scale);
                Color clr= new Color (colorValue , colorValue, colorValue);
                panel.setPixel(c, r, clr);
            }
        }
        
    }
    // for a given x, y value, plot the downhill path from there
    private static void plotDownhillPath(int x, int y)
    {
        int minX = Math.max(x-1, 0);//if going to the left of the point
        int minY = Math.max(y-1, 0);//if goiing above the point
        int maxX = Math.min(x+1, cols);//if going to the right to the point
        int maxY = Math.min(y+1, rows); //if going below the point
        
        int lowestX = x; //assumes the parameter is the lowest point
        int lowestY = y; //assumes the parameter is the lowest point
        
        for (int newY = minY; newY < maxY; newY++)
        {
            for (int newX = minX; newX < maxX; newX++)
            {
                if (grid [newY][newX] <= grid [lowestY][lowestX])
                {
                    lowestY= newY;//finds the downhill path by replacing values with the lowest point  
                    lowestX= newX;
                }
            }
        }
        
        if (lowestX != x || lowestY != y)//if I am not stuck at my original point
        {
            x = lowestX;
            y = lowestY; 
            panel.setPixel(x, y, Color.blue);
            plotDownhillPath(x, y);//now repeat the steps with your new point 
        
        
        }
    }
    
   private static void plotAllPaths()
    {
        for (int r = 0; r < rows; r++)//iterate through rows
        {
            for (int c = 0; c < cols; c++)//iterate through columns 
            {
                plotDownhillPath(c, r);//repeats steps for each point 
    }
}
}
}
