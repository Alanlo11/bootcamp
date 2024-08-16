import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {

    // Example 1 - static method
    List<Integer> integers = Arrays.asList(3, 7 -5, 100);
    
    // Lambda
    integers.stream().forEach(e -> System.out.println(e));
    // Method Reference : input = method parameter
    integers.stream().forEach(System.out::println);

    // Lambda
    integers.stream().forEach(e -> System.out.println(e+10));
    // Method reference cannot perform the above.

    // Example 2 - instance method
    String name = "vincent";
    // Lambda
    Supplier<Integer> nameLength = () -> name.length();
    // Method reference
    Supplier<Integer> nameLength2 = name::length;

    // Example 3 - instance method (2 parameter)
    // Lambda
    Comparator<Integer> sortByDesc = (i1, i2) -> i1.compareTo(i2);
    Comparator<Integer> sortByDesc2 = Integer::compare;// i1.compareTo(i2)
    double d = Double.MAX_VALUE;

    // Example 4 - constructor
    // Lambda
    Function<String, String> construcString = s -> new String(s);
    // Method reference
    Function<String, String> construcString2 = String::valueOf;
    Function<String, String> construcString3 = String::new;
    String s = construcString3.apply("hello");
  

  }
}
