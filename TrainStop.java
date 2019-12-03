/***********************************************
 * TrainStop.java
 * Jesse Patrick
 *
 * creates TrainStop Objects
 ***********************************************/

public class TrainStop 
{
    private String name;  // name of station
    private int location; // where the location is

    public TrainStop(String name, int location)
    {
        this.name = name;
        this.location = location;
    }

    //********************************************************
    
    public String getName()
    {
        return this.name;
    } // end getName()

    //********************************************************
    
    public int getLocation()
    {
        return this.location;
    } // end getLocation()

    //********************************************************
    
    public String toString()
    {
        return "Train stop name is " + name + " --- Train stop location = " + location;
    }
}// end TrainStop
