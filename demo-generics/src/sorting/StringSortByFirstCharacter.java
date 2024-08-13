package sorting;

import java.util.Comparator;

public class StringSortByFirstCharacter implements Comparator<String>{
  @Override
  public int compare(String s1, String s2){
    return s1.charAt(0) > s2.charAt(0) ? -1 : 1;
  }
}
