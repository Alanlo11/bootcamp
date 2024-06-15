public class DemoLiteralPool {
  public static void main(String[] args) {
    //Literal Pool (String)
    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1 == s2);//true
    System.out.println(System.identityHashCode(s1));
    System.out.println(System.identityHashCode(s2));

    String s3 = "hello";
    String s4 = new String("hello");
    System.out.println(s3 == s4);//false 因為唔同object
    System.out.println(s1 == s3 && s2 == s3);//true

    s3 = s4;
    System.out.println(s3 == s4);//true,they are pointing to the same object

    String s5 = "he";
    String s6 = "llo";
    s5 = s5 + s6;//hello (new String) 背後係new String
    System.out.println(s1);//hello
    System.out.println(s5);//hello
    System.out.println(s5 == s1);//false,

    //Immutable String object唔可以改
    String s7 = "hello";
    System.out.println(System.identityHashCode(s7));
    s7 += " World";//heap唔會將s7變成hello world,就會new左一隻新object出黎,唔可以改原本隻object
    System.out.println(System.identityHashCode(s7));//not same location(different object)

    String s8 = "hello";
    System.out.println(System.identityHashCode(s8));
    s8 = s8.replace("e","a");//new
    System.out.println(s8);
    System.out.println("s8 = " + System.identityHashCode(s8));

    String s9 = "hello";
    System.out.println(System.identityHashCode(s9));
    s9 = s9.toUpperCase();
    System.out.println(System.identityHashCode(s9));//1309552426

    //Same idea apply most of String methods:
    //concat(),subString()


  }
  
}
