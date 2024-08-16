import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    
    List<String> capNames = strings.stream() // List<String> -> new Stream<String>
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
    List<Customer> customers = new LinkedList<>();
    customers.add(new Customer("john",20));
    customers.add(new Customer("benny",35));
    customers.add(new Customer("kit",43));
    
    // filter 25 or above
    List<Customer> customerAfterFilter = customers.stream() // Stream(Customer)
    .filter(customer -> customer.getAge() >= 25) // Stream(Customer)
    .collect(Collectors.toList());
    
    System.out.println(customerAfterFilter);// [Customer: benny Age:35, Customer: kit Age:43]

    // filter name length >= 4
    // and return List<String>
    List<String> names = customers.stream()// Stream<Customer>
    .filter(c -> c.getName().length() >= 4) //Stream<Customer>
    .map(c -> c.getName())// Stream<String>
    .collect(Collectors.toList());// List<String>
    System.out.println(names);// [john, benny]

    List<String> naneList = new ArrayList<>();
    for(int i=0 ; i<customers.size() ; i++){
      if(customers.get(i).getName().length() >= 4){
      customers.get(i).getName();
      }
    }

    // we can map(), and then filter()
    customers.stream()// Stream<Customer>
    .map(c -> c.getName())// Stream<String>
    .filter(str -> str.length() >= 4)
    .collect(Collectors.toList());// List<String>


    customers.stream()// Stream<Customer>
    .filter(c -> c.getName().length() >= 4)// Stream<Customer>
    .map(c -> c.getName())// Stream<String>
    .forEach(name ->{
      System.out.println(name);
    });

    customers.stream()
    .filter(c -> c.getAge() < 40)
    .count();// long 2

    customers.add(new Customer("benny", 38));


    // distinct -> remove duplicated (by equals() and hashCode())
    List<Customer> customersAfterDustinct = customers.stream()
    .distinct()// Stream<Customer>        call Customer equals() hashCode
    .collect(Collectors.toList());

    System.out.println(customersAfterDustinct);// 少左一個benny
    // [Customer: john Age:20, Customer: benny Age:35, Customer: kit Age:43]

    // sort

    // Lambda Expression (Skip class implementing interface Comparator)
    Comparator<Customer> sortByAge = (c1, c2) -> c1.getAge() < c2.getAge() ? -1 : 1 ;

    List<String> customerAfterSort = customers.stream()
    .filter(c -> c.getAge() < 40)
    .sorted((c1, c2) -> c1.getAge() < c2.getAge() ? -1 : 1)// sort by age ascending order
    // .sorted(sortByAge); 咁寫都可以，同上面個句一樣
    .map(c -> c.getName())// Strean<String>
    .collect(Collectors.toList());
    // [john, benny, benny]

    // int compare ( T o1, T o2);

    System.out.println(customerAfterSort);

    // Terminal Operation (Collect(), count(), etc) -> return non-Stream Type
    // InTerminate Operation ( filter(), map(), sorted(), distinct()) -> return Stream<>
    Stream<Customer> customerList = customers.stream()// Stream<Customer>
      .filter(c -> !"john".equals(c.getName())); //Stream<Customer>

    // c.getName().equals("john") -> prtentially Null pointer exception


      System.out.println(customerList.count());// 3
      // System.out.println(customerList.collect(Collectors.toList()));// NOT OK
      // stream has already been operated upon or closed
      // You cannot perform 2 terminal operations on a stream object

    // Map -> key: name value: name length
    List<String> animals = Arrays.asList("Lions", "Tigers", "Bears");
    // From List -> Stream -> Map
    Map<String,Integer> animalMap = animals.stream()
    .collect(Collectors.toMap(s -> s, s -> s.length()));

    System.out.println(animalMap);// {Lions=5, Tigers=6, Bears=5}

    // groupBy
    List<Staff> staffs = Arrays.asList(new Staff("HR", "John"), new Staff("IT", "Peter"), new Staff("MKT", "Sally"), new Staff("IT", "Vincent"));


    // Map<String, List<Staff>>
    Map<String, List<Staff>> staffMap = staffs.stream()
    .collect(Collectors.groupingBy(staff -> staff.getDepartment()));

    System.out.println(staffMap.get("IT"));
    // [Department:IT Name:Peter, Department:IT Name:Vincent]

    // from List<Staff> -> Map<String, List<Staff>>
    // contains,  -> get -> list.add -> put
    // ! contains -> new ArrayList() -> add -> put
    // for(){
    // }

    List<Staff> staffList = 
    Arrays.asList(new Staff("HR", "John", 30000), new Staff("IT", "Peter", 40000),
                  new Staff("MKT", "Sally", 25000), new Staff("IT", "Vincent", 20000));

    // HR 30000
    // IT 60000
    // MKT 25000

    Map<String, Integer> deptMap = staffList.stream()
    .collect(Collectors.groupingBy(s -> s.getDepartment()
    ,Collectors.summingInt(s -> s.getSalary())));

    System.out.println(deptMap.get("IT"));// 60000 -> 40000 + 20000
    System.out.println(deptMap.get("MKT"));// 25000
    System.out.println(deptMap.get("HR"));// 30000

    // Construct Stream  object by initial values
    Stream<Integer> integers = Stream.of(4,1,2,3);

    Stream<Staff> staff = Stream.empty();

    // Stream :
    // filter, distinct -> reduce elements
    // Map, sort -> revise object definition (No change on element count)
    // count, groupingBy, summingInt -> summarize operation

    // Special Case:
    List<Integer> integers2 = Stream.of(2,3,4).map(i -> i + 1).collect(Collectors.toList());
    System.out.println(integers2);// [3, 4, 5]
    

    // map() -> interminate operation -> it won't execute until terminal operation
    Stream<Integer> integers3 = Stream.of(2,3,4).map(i -> {
      System.out.println(i);
      return i+1;
    });
    // sysout not working
    // because the stream object did not perform terminal operation

    // count  terminal operation  -> observe interminate operations, check if they will make impact or not
    // so finally map() won't execute, because it will not affect the result of count()
    System.out.println(integers3.count());// 3







    // List<String> st = new ArrayList<>();
    // st.add("abc");
    // st.add("bbb");
    // st.add("ccc");

    // List<String> st1 = st.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    // System.out.println(st1);



  }
}