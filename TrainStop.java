/***********************************************
 * TrainStop.java
 * Jesse Patrick
 *
 * creates TrainStop Objects
 ***********************************************/
import java.util.*;
public class TrainStop {
    private String name;  // name of station
    private int location; // where the location is

    //********************************************************
    public TrainStop(String name, int location)
    {
        this.name = name;
        this.location = location;
    }

    //********************************************************
    // gets the name of the train stop
    public String getName()
    {
        return this.name;
    } // end getName()

    //********************************************************
    // gets the location of the train stop
    public int getLocation()
    {
        return this.location;
    } // end getLocation()

    //********************************************************
    // converts everything to string
    public String toString()
    {
        return "Train stop name is " + name + "\nTrain stop location = " + location;
    }

}// end TrainStop
