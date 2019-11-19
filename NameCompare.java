import java.util.Comparator;

public class NameCompare implements Comparator<TrainStop>
{
  public int compare(TrainStop a, TrainStop b)
  {
    return a.getName().compareTo(b.getName());
  } // end compare
} // end NameCompare
