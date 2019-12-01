/******************************************************************************
* TrainStopDriver.java
* by Jay Canty
* 
* 
******************************************************************************/

public class TrainStopDriver 
{
  public static void main(String[] args) 
  {
    TrainRoute route = new TrainRoute();
    TrainStop[] stops = {new TrainStop("Jesse", 1), new TrainStop("Manish", 4), 
      new TrainStop("Jay", 8), new TrainStop("Cross Roads", 6), new TrainStop("Downtown", 0),
      new TrainStop("Westport", 5)};
    
    for (TrainStop ts : stops)
    {
      route.add(ts);
    }
    
    route.printStops();
    route.getRoute("Westport", "Jesse");
    route.getRoute("Manish", "Crossroads";
    route.getRoute("Downtoen", "Jay");
  } // end main
} // end TrainStopDriver
