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
    //For Class,you should always compare their object value by METHOD!!!!!!
    System.out.println("interger"+i3.compareTo(i4));//0

    //useless chk object only
    //System.out.println(i3>=i4);
    //System.out.println(i1>=i2);

    //因為－128 to 127 Float係包埋小數點後既數，中間有好多個數，唔會有晒咁多個數，所以係唔support
    //Float,Double (No Internal Cache in JVM)
    Float f1 = 10.12345f;//autobox float value -> Float object
    Float f2 = 10.12345f;//autobox float value -> Float object
    System.out.println(f1 == f2);//false (No Internal Cache in JVM)

    Double d1 = 128.12345d;//autobox float value -> Float object
    Double d2 = 128.12345d;//autobox float value -> Float object
    System.out.println(d1 == d2);//false (No Internal Cache in JVM)


    //Boolean:support Internal cache because only 2 Value
    Boolean b1 = true;//autobox float value -> Float object
    Boolean b2 = true;//autobox float value -> Float object
    System.out.println(b1 == b2);//true

    //Character:Support Internal cache (-128 to 127)
    Character c1 = 'c';
    Character c2 = 'c';
    System.out.println(c1 == c2);//true

    //only -128 to 127 can support Internal cache
    Character c3 = '你';
    Character c4 = '你';
    System.out.println(c3 == c4);//false
    
  }
  
}
