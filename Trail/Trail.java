public class Trail
{
    /** Representation of the trail. The number of markers on the trail is markers.length. */
    private int[] markers;

    public Trail(int[] trail)
    {
        markers = trail;
    }
    
    /** Determines if a trail segment is level. A trail segment is defined by a starting marker,
    * an ending marker, and all markers between those two markers.
    * A trail segment is level if it has a difference between the maximum elevation
    * and minimum elevation that is less than or equal to 10 meters.
    * @param start the index of the starting marker
    * @param end the index of the ending marker
    * Precondition: 0 <= start < end <= markers.length - 1
    * @return true if the difference between the maximum and minimum
    * elevation on this segment of the trail is less than or equal to 10 meters;
    * false otherwise.
    */
   public boolean isLevelTrailSegment(int start, int end)
   {
       int max = markers[start];
       int min = markers[start];
       for (int i = start; i <= end; i++)
       {
           max = Math.max(markers [i], max);
           min = Math.min(markers [i], min);
        }
       if (max - min <= 10)
        { 
            return true; 
       }
       else 
       { return false;
        }
   
   }
   /** Determines if this trail is rated difficult. A trail is rated by counting the number of changes
   * in elevation that are at least 30 meters (up or down) between two consecutive markers. A trail
   * with 3 or more such changes is rated difficult.
   * @return true if the trail is rated difficult; false otherwise.
   */
  public boolean isDifficult()
  {
      int count = 0;
      for (int i = 0; i < markers.length -1; i++)
      {
          if ((markers [i] - markers [i+1]) >= 30)
          { 
              count ++;
           }
        }
      
        if (count >= 3)
        
        {
            return true;
        }
        else 
        {
            return false;
        }
    
}

  // returns a string representation of this Trail object
  public String toString()
  {
      String index =   "Marker   ";
      String element = "Elevation";
      for (int i = 0; i < markers.length; i ++)
      {
          index += "\t" + i;
          element += "\t" + markers[i];
      }
      return (index + "\n" + element);
  }
}
