import java.util.HashMap;
import java.util.Objects;

public class HKID {
  private String value;

  public HKID(String value){
    this.value = value;
  }

  public String getValue(){
    return this.value;
  }

  @Override
  public String toString(){
    return "HKID:" + this.value;
  }

  //if you don't Override equals() and hashCode()
  //it extends them from Object.class
  //so,we compare "HKID Object 1" and HKID Object 2" 

  //if you override equals() and hashCode()
  //if implies that you want to define their condition to be equal yourself
  @Override
  public boolean equals(Object obj){
    if(this == obj)
      return true;
      if(!(obj instanceof HKID))
        return false;
      HKID hkid = (HKID) obj;
      return Objects.equals(this.value, hkid.value);
  }

  @Override
  public int hashCode(){
    return Objects.hashCode(this.value);
  }

  public static void main(String[] args) {
    HashMap <HKID, Customer> person = new HashMap<>();
    //"A1234567",34,John
    //"H2345678",18,Jenny
    HKID hkid1 = new HKID("H2345678");

    person.put(new HKID("A1234567"), new Customer(34, "John"));
    person.put(hkid1, new Customer(18, "Jenny"));
    System.out.println(person);

    //duplicate key
    //put one more customer -> //"A1234567",34,John
    person.put(new HKID("A1234567"), new Customer(34, "John"));
    System.out.println(person);
    person.put(hkid1, new Customer(18, "Alan"));
    System.out.println(person); // put() logic:dompare existing keys and the new key

    //Solution: Override equals() and hashCode() in Ket.class(HashMap <key, value> )

    System.out.println(hkid1.hashCode());//-431421299
    System.out.println(person.get(hkid1).hashCode());//705927765
    

    HashMap <String , Integer> a = new HashMap<>();
    a.put("a", 01);
    System.out.println(a);
    a.put(new String("a"), 01);

    String a1 = "a";
    String a2 = new String("a");
    String a3 = new String("a");
    System.out.println(a1.hashCode());
    System.out.println(a2.hashCode());
    System.out.println(a3.hashCode());

    System.out.println(new HKID("1234").equals(new HKID("1234")));//true,because you Override equals() and Hashcode()


    //put() -> use equals() and hashCode()
    //objective of equals() & hashCode(): identify if they are same object
    //HashMap.class equals() is to identify if the same key
    //同一個key，點為知一樣?係自己可以參與

    //put()  pargram flow: hashmap.put(key, value) -> calls key.equals() & key.hashcode()

    //How about HashMap<String, String> ?
    //String.class is already done.you cannot Override,change the implementation of equals() and hashCode()
    //so String.equals() compares the values itself to determine if they are same object

    //How about HashMap<Integer, String> ?
    //Integer.class is already done.you cannot Override,change the implementation of equals() and hashCode()
    //so Integer.equals() compares the values itself to determine if they are same object

    System.out.println(new Integer(129).equals(new Integer(129)));//true,comparing values,not comparing address.
    System.out.println(new Integer(129) == new Integer(129));//false,comparing address

  }
}