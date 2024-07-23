import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("hello");
    strings.add("abc");
    strings.add("def");
    System.out.println(strings);//[abc, def, hello]
    //ordering is not determined by insertion order

    ArrayList<String> s1 = new ArrayList<>();
    s1.add("hello");
    s1.add("abc");
    s1.add("def");
    System.out.println(s1);//[hello, abc, def]
    //ordering follows the insertion order

    //add duplicated string value
    strings.add("hello");
    s1.add("hello");
    boolean hsResult = strings.add("hello");
    boolean hsResult2 = s1.add("hello");

    System.out.println(hsResult);//false
    System.out.println(hsResult2);//true

    System.out.println(strings);//[abc, def, hello]
    System.out.println(s1);//[hello, abc, def, hello]

    System.out.println(strings.size());//3
    System.out.println(strings.remove("abc"));//true
    System.out.println(strings.contains("def"));//true
    //isEmpty()
    //addAll()

    //Q1.Remove dupaicate value
    String[] arr = new String[]{"abc","def","xyz","def"};
    HashSet<String> result = new HashSet<>();
    for(String x : arr){
      result.add(x);
    }
    System.out.println(result);

    HashSet<String> result2 = new HashSet<>();
    ArrayList<String> arrlist = new ArrayList<>();
    for(String x : arr){
      if(!result2.add(x)){
        arrlist.add(x);
      }
    }
    System.out.println(arrlist);

  }
}