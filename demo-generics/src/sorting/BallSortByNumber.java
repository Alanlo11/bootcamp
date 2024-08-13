package sorting;

import java.util.Comparator;

public class BallSortByNumber implements Comparator<Ball>{
  @Override
  public int compare(Ball b1, Ball b2){
    return b1.getNumber() > b2.getNumber() ? -1 : 1;
  }
  
}
