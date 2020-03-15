public class Clock
{
    //declare instance variables
    private int hours, minutes, seconds;
    //default constructor with no parameters
    public Clock()
    {
        this (0, 0, 0);
    }
    //constructor that establishes the values of the numerator and denominator
    public Clock(int h, int m, int s)
    {
        hours = h;
        minutes = m;
        seconds = s;
    }
    //setter methods assigns instance varuavles to public variables
    public void setClock (int h, int m, int s)
    {
        hours = h;
        minutes = m;
        seconds = s;
    }
    //returns hours 
    public int getHours()
    {
        return hours;
    }
    //return minutes
    public int getMinutes()
    {
        return minutes;
    }
    //return seconds
    public int getSeconds()
    {
        return seconds;
    }
    
    public String toString()
    {
        String str;
        str = hours + ":" + minutes + ":" + seconds;
        return str;
    }
    
}
