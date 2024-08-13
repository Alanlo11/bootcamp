import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoStream {
  public static void main(String[] args) {
    List<String> strings = new LinkedList<>();
    strings.add("John");
    strings.add("Jenny");
    strings.add("Sam");

    // lambda for-each
    strings.forEach(s -> System.out.println(s));

    // for loop
    for(int i=0 ; i<strings.size() ; i++){
      strings.set(i, strings.get(i).toLowerCase());
    }
    System.out.println(strings);// [john, jenny, sam]
    
    List<String> capNames = strings.stream() // List<String> -> Stream<String>
    .map(s -> s.toUpperCase()) //Stream<String>
    .collect(Collectors.toList()); // List<String> (new object)

    System.out.println(strings);// [john, jenny, sam]
    System.out.println(capNames);// [JOHN, JENNY, SAM]

    capNames.add("SAM");
    System.out.println(capNames);//JOHN, JENNY, SAM, SAM]

    List<String> capNames2 = capNames.stream()
    .map(s -> {
      String newStr = s.toLowerCase() + s.toUpperCase();
      return newStr + "!!!";
    })
    .collect(Collectors.toList()); // 要背

    System.out.println(capNames2);// [johnJOHN!!!, jennyJENNY!!!, samSAM!!!]

    // Customer
    List<Customer> cus = new LinkedList<>();
    cus.add(new Customer("abc"));
    cus.add(new Customer("def"));
    cus.add(new Customer("asd"));
    // List<Customer> cus1 = cus.stream().map(c -> c.getName().toUpperCase()).collect(Collectors.toList());
    

    List<String> st = new ArrayList<>();
    st.add("abc");
    st.add("bbb");
    st.add("ccc");

    List<String> st1 = st.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    System.out.println(st1);



  }



}