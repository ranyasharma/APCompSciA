public class HorseBarn
{
  /** The spaces in the barn.  Each array element hold a reference to the horse
   *  that is currently occupying the space.  A null value indicates an empty space.
   `*/
  private Horse[] spaces;
   
  public HorseBarn(Horse[] spaces)
    {
        //constructor 
       this.spaces = spaces;
    }
    
  /** Returns the index of the space that contains the horse with the specified name.
     *  Precondition: No two horses in the barn have the same name.
     *  @param name the name of the horse to find
     *  @return the index of the space containing the horse with the specified name;
     *          -1 if no horse with the specified name is in the barn.
     */
    public int findHorseSpace(String name)
    {
        
        for (int i=0; i<spaces.length; i++)//goes through each of the stables in barn 
        {
           if (spaces[i]!=null && spaces[i].getName().equals(name))//checks to see if 
           //the stable is null, if it is then it returns -1. If the stable is not null 
           //AND the name of the stable is the same as the name  of the horse, it will return 
           //the number of the stable (index number)
            {
                return i;
            }
        
    }
    return -1;
}


     /** Consolidates the barn by moving horses so that the horses are in adjacent spaces,
     * starting at index 0, with no empty space between any two horses.
     * Postcondition: The order of the horses is the same as before the consolidation.
     */
     public void consolidate()//void so no return statement!
    {
     
    Horse [] newSpaces = new Horse [spaces.length];//creates a new array with the same length 
    //as the original barn 
    int j =0; //variable used for the index of elements in the new barn 
    
    
    for (int i = 0; i < spaces.length; i++)
    {
        if (spaces[i] != null)//checks to see if there is a horse in the stable. if there is not 
        //a horse, it will look to the next stable in the original. 
        {
            newSpaces [j] = spaces [i];//if there is a horse in the stable, the new stable 
            //will have the name of the horse from the original stable. This makes sure that 
            //there is no empty space between horses 
            j++;//increments to the next stable in the new barn. 
        }
    }
    spaces = newSpaces;//sets the original barn equal to the new barn 
    
}
}
