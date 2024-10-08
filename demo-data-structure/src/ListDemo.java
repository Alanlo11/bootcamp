import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListDemo {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>(); //ArrayList.class implements List.class
    strings.add("hello");
    strings.add("abc");
    strings.remove("abc");
    System.out.println(strings.size());//1

    String s1 = "abc";
    s1.contains("b");
    

    //ArrayList.class has all method defined in List.class
    //ArrayList MAY implement more than one interface
    //ArrayList MAY have its own methods,which did not define in interfaces

    //Polymorphism
    //1. scope of strings(obj ref) -> compile time
    //2. implementation -> runtime

    //Collection.class
    Collection<String> strings2 = new ArrayList<>();
    strings2.add("hello");
    System.out.println(strings2.size());//1

    strings2 = new HashSet<>();

    Set<String> strings3 = new HashSet<>();
    // strings3 = new ArrayList<>();//NOT OK,ArrayList.class did not implement Set interface
    strings.add("hello");

    //so,the implemention ArrayList.add() differ to the implementation of HashSet.add()

    //Map.class
    Map<String, String> nameMap = new HashMap<>();
    
    //Data Structure of data structure
    List<HashMap<String, String>>maplist = new ArrayList<>();
    HashMap<String, String> nameList = new HashMap<>();
    nameList.put("abc", "John");

    HashMap<String, String> bookList = new HashMap<>();
    nameList.put("def", "Book A");
    maplist.add(nameList);
    maplist.add(bookList);

  }
}