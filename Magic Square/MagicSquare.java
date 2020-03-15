public class MagicSquare
{
/** The magic square array data */
 private int[][] array;

/**
     * Constructs a MagicSquare object.
     * @param input the magic square array data.
     */
    public MagicSquare(int[][] input)
    {
        array = input;
    }

public int leftToRight()//diagonal (left to right diagonal) 
    {
        int sum = 0;//sets sum to 0
        for (int i = 0; i<array.length; i++)//iterates through the 2D array 
        {
            
            sum += array[i][i];//gets the sum of the diagonal
            //ex: [0][0] = top left corner, [1] [1] is one right and one down, [2][2] is two right right two down
            
        }
        return sum;//return sum   
    }

public int rightToLeft()
{
    int sum = 0;//sets sum to 0
    for (int i = 0; i<array.length;i++)//iterates through the 2D array
    {
        int j = array.length -1-i;//array.length-1 finds the last spot in the array. 
        //for example, when i = 0 and array.length = 9, j=8
        //sum += array[0][8]. This is the position at the top right.
        //when i =1 and array.length =9, j=7
        //sum += array [1][7]. This is the 2nd row, 2nd from the far right
        sum += array [i] [j];
    }
    return sum;//returns sum of diagonal
}

public int sumRow(int row)
{
    int sum = 0;//sets sum to 0
    for (int i = 0; i<array[row].length; i++)//iterates through the row 
    {
        sum += array [row] [i];//sums the elements in the row, as the row stays the same
    }
    return sum;//returns sum of the row 
}

public int sumCol(int col)
{
    int sum = 0;//sets sum to 0. 
    for (int i = 0; i<array.length; i++)//iterates through the array 
    {
        sum += array[i][col];//sums the element in the column. looks at every row in the column   
    }
    
    return sum;//returns sum of column 
}
    
/**
     * Tests to see if array is indeed a magic square
     * @return true if array is a magic square
     * @return false if the array is not a magic square
     */
    public boolean isMagicSquare()
    {
        boolean answer = true;//sets boolean to true
        int sum = sumRow(0); //creates a perfect sum (doesn't matter which row you do it for)
        for (int i = 0; i< array.length; i++)//iterates through the array and if any of the sums do not equal 
        //the perfect sum it returns false. 
        {
            if (sumRow(i) != sum)
            {
                answer = false;
            }
            
            if (sumCol(i) != sum)
            {
                answer = false;
            }
            
            if (leftToRight() != sum)
            {
                answer = false;
            }
            
            if (rightToLeft() != sum)
            {
                answer= false;
            }
            
        }
        return answer;
    }
               

/**
     * Returns a String which represents the array.
     */
    public String toString()
    {
        String result = "";
        for(int r = 0; r < array.length; r++)
        {
            for(int c = 0; c <array[r].length; c++)
            {
                result += array[r][c];
                result += "\t";
            }
            result += "\n";
        }
        return result;
    }
}
