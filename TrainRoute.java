package groupProject;

/********************************************************************
* TrainRoute.java
* Manish Lamsal
* 
* ******************************************************************/

import java.util.*;

public class TrainRoute
{
  TreeSet<TrainStop> alpha = new TreeSet<TrainStop>(new NameCompare());
  
  TreeSet<TrainStop> geo = new TreeSet<TrainStop>(new LocationCompare());
  
  public void add(TrainStop stop)
  {
    alpha.add(stop);
    geo.add(stop);
  } // end add
  
  public void getRoute(TrainStop current, TrainStop dest)
  {
    TreeSet<TrainStop> route = new TreeSet<TrainStop>();
    route = (TreeSet<TrainStop>) geo.subSet(current, dest);
    Iterator<TrainStop> iterate;
    iterate = route.iterator();
    
    while (iterate.hasNext())
    {
      System.out.println(iterate.next());
    }
  } // end getRoute
  
  public void printStops()
  {
    Iterator<TrainStop> iterate;
    iterate = alpha.iterator();
    
    while (iterate.hasNext())
    {
      System.out.println(iterate.next());
    }
  } // end prinStops
  
} // end TrainRoute
