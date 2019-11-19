import java.util.Comparator;

public class LocationCompare implements Comparator<TrainStop>
{
  public int compare(TrainStop a, TrainStop b)
  {
    return a.getLocation() - b.getLocation();
  } // end compare
} // end LocationCompare
