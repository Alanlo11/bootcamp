public class DemoInteger {
  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(3);
    Integer i2 = 3;//autobox int -> Integer Object(heap memory)
    //Internal Cache (For number)
    i1 = 127;//i1 object reference 127 -> (1st) create Integer object
    i2 = 127;//i2 object reference 127 -> (2nr) reuse the orginal Integer object
    // -128 to 127 -> reuse the original object
    System.out.println(i1 == i2); //true (are they same object?)

    Integer i3 = 128;//1 create integer object
    Integer i4 = 128;//2 create integer object
    System.out.println(i3 == i4); //false (are they same object?)


    //Important !!!
    //For Class,tou should always compare their object value by METHOD!!!!!!
    System.out.println(i3.compareTo(i4));//0

    //useless chk object only
    //System.out.println(i3>=i4);
    //System.out.println(i1>=i2);


  }
  
}
