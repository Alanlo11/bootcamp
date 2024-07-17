public class WrapperClass {
  public static void main(String[] args) {
    //the relationship between Object and Primitive
    int x = 10;
    Integer x2 = x;//auto-box(int -> Integer)
    int x3 = x2;//unbox (Integer -> int)

    Character c = 'c';//char value -> Character Object (autobox)
    //c = object reference
    //'c' -> autobox -> new Character Object

    Boolean b = null;//
    b = true; //autobox (primitive boolean -> Boolean Object)
    b = false;
    b = Boolean.valueOf(true);
    b = new Boolean(false);

    //Stack & Heap
    Integer i1 = 128;
    Integer i2 = 128;
    System.out.println(i1 == i2);//false

    Integer i3 = 127;
    Integer i4 = 127;
    System.out.println(i3 == i4);//true 因為常用值會已存在係memory到，所以常用既數會用返同樣既object

    String s2 = "abc";
    String s3 = "abc";
    System.out.println(s2 == s3);//true,String pool
    String s4 = new String("abc");
    System.out.println(s2 == s4);//false
    String s5 = String.valueOf("abc");
    System.out.println(s2 == s5);//true

  }
}
