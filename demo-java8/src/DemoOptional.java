import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
  public static void main(String[] args) {
    String s = "hello";
    s = null;
    generate(s); // OK

    // Optional<T> 只用作於return type

    // method user
    // generate(s).charAt(0);// error

    // alternative
    // generate2() -> return Optional<String> -> the return value can be null or num null
    // the jave will force to handle potenial null scenario during compile-time
    Optional<String> result = generate2(s);
    char target = ' ';
    if(result.isPresent()){// not null
      target = result.get().charAt(0);
    } else {// null
      target = '_';
    }

    // Ways to create Optional Object
    System.out.println(Optional.of("Hello"));// OK -> Optional[Hello]
    // Optional.of(null);// NOT OK
    Optional<String> s2 = Optional.ofNullable(null);// OK
    s2 = Optional.ofNullable("abc");// OK
    Optional<String> optString = Optional.empty();// same as Optional.ofNullable(null);

    // ifPresent() -> Lambda Expression
    // s is String value already, but not Optional<String>
    target = ' ';
    int x = 0;
    generate2("abc").ifPresent(string -> {
      // target = string.charAt(0);// NOT OK
      string.charAt(0);// OK
      // target = string.charAt(0); // NOT OK for Write
      System.out.println(x);// OK for Read
    });

    // Stream -> findfirst(), findAny()
    List<Customer> customers = Arrays.asList(new Customer("John", 13),new Customer("Jenny", 30), new Customer("Peter", 28));
    
    Optional<Customer> optCusOptional = customers.stream()
    .filter(customer -> customer.getAge() > 20)
    .findFirst();

    customers.stream()
    .filter(customer -> customer.getAge() > 20)
    .findFirst()
    .ifPresent(c -> System.out.println(c));// Customer: Jenny Age:30

    // You should not findFirst() and then get()
    // customers.stream()
    // .filter(customer -> customer.getAge() > 50)
    // .findFirst()// Optional.ofNullable(null)
    // .get();// java.util.NoSuchElementException

    // ways to take the element from the optional object
    // 1. isPresent()
    // 2. ifPresent()
    // 3. orElse()
    Optional<Customer> optCustomer2 = Optional.of(new Customer("Mary",21));
    Customer customer = optCustomer2.orElse(new Customer("Susan", 28));
    System.out.println(customer);// Customer: Mary Age:21
    // 4. orElseThrow()
    Customer cumtomer2 = optCustomer2.orElseThrow(() -> new RuntimeException());
    // 5. orElseGet()
    optCustomer2.orElseGet(() -> new Customer("dummy",-99));


    //
    Optional<String> optCustomer4 = null;
    // optCustomer4.orElse("hello");// NPE

    Optional<String> optCustomer5 = Optional.ofNullable(null);
    optCustomer5.orElse("dummy");// OK



  }
  // method author
  public static String generate(String s){
    if(s == null)
    return null;
    return s.replace('a','b').toUpperCase();
  }

  // 1. Optional<String> != String
  public static Optional<String> generate2(String s){
    if(s == null)
     return Optional.ofNullable(null);
    return Optional.of(s.replace('a','b').toUpperCase());

  }
}
