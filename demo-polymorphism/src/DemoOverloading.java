public class DemoOverloading {

  private int a;
  private int b;

  public DemoOverloading(){
    // this.a = 100;
    // this.b = 100;

    //Aternative(Overloading)
    this(100.2,100.2);//DemoOverloading(double a,double b)
  }

  public DemoOverloading(double a){
    // this.a = a;
    // this.b = 100;

    //Aternative(Overloading)
    this(a,100.2);//DemoOverloading(double a,double b)
  }

  public DemoOverloading(int a,int b){
    this.a = a;
    this.b = b;
  }

  public DemoOverloading(double a,double b){
    this.a = (int)a;
    this.b = (int)b;
  }

  //Method signature = method name + parameter(s)

  public static int sum(int x,int y){
    return x+y;
  }

  //因為method signature一樣，所以return type唔同都唔得
  // public static double sum(int x,int y){  //Duplicate method,even if different return type
  //   return x+y;
  // }

  public static double sum(double x,double y){
    return x+y;
  }

  //兩個調轉都會係唔一樣既野
  public static long sum(int x,long y){
    return x+y;
  }

  public static long sum(long x,int y){
    return x+y;
  }

  public static void sum(Object x,Object y){
      System.out.println("void sum(Object x,Object y)");
  }

  public static void sum(Animal x,Animal y){
    System.out.println("Animal x,Animal y");
  }

  public static void main(String[] args) {
    //Purpose of Overloading
    //The design of overloading for methods is to let user (method user) easier to use.
    //Overloading is designed and checked during compile time

    //Example 1:
    String a = String.valueOf(true);//ture
    String b = String.valueOf(2.0d);//2.0
    char[] arr = new char[]{'c','b','a'};
    System.out.println(String.valueOf(arr));

    //Example 2:
    System.out.println(sum(1, 2));
    System.out.println(sum(1.0, 2.0));//3.0

    System.out.println(sum((byte)3, (short)9));//12 or 12.0 揀最接近既method，所以會係12

    sum("abc","bcd");
    System.out.println(sum(10L,12L));//Long Primitive 22.0 -> double
    sum(new Cat(), new Dog());


    //What if the method parameters are with type of Wrapper Class?
    //Try it out.

  }
}