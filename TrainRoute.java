/********************************************************************
* TrainRoute.java
* Manish Lamsal and Jay Canty
* 
* models a train/subway line
* ******************************************************************/

import java.util.*; // TreeSet, SortedSet, Iterator

public class TrainRoute
{
  // hold the TrainStop objects in alphabetical order
  TreeSet<TrainStop> alpha = new TreeSet<TrainStop>(new NameCompare());
  // hold the TrainStop objects in order of location
  TreeSet<TrainStop> geo = new TreeSet<TrainStop>(new LocationCompare());
  
  //**********************************************************************
  
  public void add(TrainStop stop)
  {
    alpha.add(stop);
    geo.add(stop);
  } // end add
  
  //**********************************************************************
  
  // prints the TrainStop objects from one location to another location
  
  public void getRoute(TrainStop current, TrainStop dest)
  {
    SortedSet<TrainStop> route;    // holds the sub set between stops
    Iterator<TrainStop> iterate;   // to traverse the route
    
    route = geo.subSet(current, dest);
    iterate = route.iterator();
    
    System.out.println("\nThe stops from " + current.getName() + " to " 
      + dest.getName() + " are:\n");
    while (iterate.hasNext())
    {
      System.out.println(iterate.next());
    }
    System.out.println(dest);
  } // end getRoute
  
  //**********************************************************************
  
  // list the TrainStop objects in alphabetical order by name
  
  public void printStops()
  {
    // traverse the stops in alphabetical order
    Iterator<TrainStop> iterate = alpha.iterator();
    
    System.out.println("\nHere are all of the stops:\n");
    while (iterate.hasNext())
    {
      System.out.println(iterate.next());
    }
  } // end prinStops
} // end TrainRoute
