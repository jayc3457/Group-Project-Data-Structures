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
    TrainStop jesse = new TrainStop("Jesse", 1);
    TrainStop manish = new TrainStop("Manish", 4);
    TrainStop jay = new TrainStop("Jay", 8);
    TrainStop crossroads = new TrainStop("Cross Roads", 6);
    TrainStop downtown = new TrainStop("Downtown", 0);
    TrainStop westport = new TrainStop("Westport", 5);
    
    route.add(jesse);
    route.add(manish);
    route.add(jay);
    route.add(crossroads);
    route.add(downtown);
    route.add(westport);
    
    route.printStops();
    route.getRoute(jesse, westport);
    route.getRoute(manish, crossroads);
    route.getRoute(downtown, jay);
  } // end main
} // end TrainStopDriver
