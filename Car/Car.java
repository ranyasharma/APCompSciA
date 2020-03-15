/**
 * Shell class for Project 4.06
 * Represents an automobile object
 * 

 */
public class Car
{
    private double mpg;
    private double mileage;
    private double tankCapacity;
    private double gasInTank;

    /**
    Constructs a car.
    @param miles miles per gallon that a car gets
    @param milesOnCar total mileage on car
    @param gasTankHolds amount of gas the tank holds
    @param gasTankHas gas in tank now
    */
    public Car(double miles, double milesOnCar, 
               double gasTankHolds, double gasTankHas)
    {
        mpg = miles;
        mileage = milesOnCar;
        tankCapacity = gasTankHolds;
        gasInTank = gasTankHas;
    }

    /**
    Returns the current mileage on the car.
    @return mileage on car
    */
    public double getMileage()
    {
        return mileage;
    }

    /**
    Returns the amount of gas in the gas tank.
    @return amount of gas in tank
    */
    public double getGasInTank()
    {
        return gasInTank;
    }
 
    /**
    Returns the gas needed to drive miles (based on mpg)
    @param numMiles the number of miles to be driven
    @return gas needed to drive numMiles miles
    */
    public double gasNeeded(double numMiles)
    {
        // code to be written in response to part a
        double numgallons;
        if (mpg == 0)
        {
            return 0;
        }
        else 
        {
        numgallons = numMiles / mpg;
        return numgallons;  // change this line
    }
    }

    /** 
    Returns true if the car has enough gas in the tank to
    drive numMiles, otherwise returns false.
    @param numMiles miles to be driven
    @return true if gas in tank is enough to drive numMiles
    miles; false otherwise.
    */
    public boolean enoughGas(double numMiles)
    {
        // code to be written in response to part b
        if ( numMiles == gasInTank * mpg)
        {
        return true;
    }
    else {
        return false;  // change this line
    }
}

    /**
    If tank is less than half full, fills tank and updates
    gasInTank.  Otherwise does nothing.
    */
    public void getGas()
    {
        // code to be written in response to part c
        if(gasInTank <= 0.5 * tankCapacity)
        {
            gasInTank = tankCapacity;
        }
     
    }

    /**
    Updates mileage and gasInTank to reflect numMiles
    being driven.
    @param numMiles number of miles driven
    */
    public void drive(double numMiles)
    {
        // code to be written in response to part d
        if ((numMiles <= gasInTank * mpg))
        {
            gasInTank = gasInTank - numMiles/mpg;
            mileage = numMiles + mileage;
            
        }
        
        else 
        {
            mileage = (mpg * gasInTank) + mileage;
            gasInTank = 0.0;
        }
    }
            
            
            
        
    }

