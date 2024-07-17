public class MethodDemo {

  private String firstName;

  public MethodDemo(String firstName){
    this.firstName = firstName;
  }

  public MethodDemo(){

  }

  public static void main(String[] args) {
    int x = sum(1,2);

    Integer x2 = sum(1, 2);//autobox sum() method returns int value -> Integer Object
    long l = sum(1, 2);//upcast,int -> long
    // Long l2 = sum(1, 2);//int -> long -> Long (autobox)
    //compiler would not do the upcast and autobox at the same statement.

    //Call static method
    MethodDemo.sum(2, 3);//return 5

    //no point to make sum2 become a instance method
    MethodDemo md = new MethodDemo();
    md.sum2(2, 3);//5
    MethodDemo md2 = new MethodDemo("john");
    String john = md2.fullName("Wong");//return a new String Object
    System.out.println(john);
  }

  public static int sum(int x,int y){
    return x + y;
  }

  //sum2() didn't use instance method to produce the return value. So,it don't need to be instance method.
  public int sum2(int x,int y){
    return x + y;
  }

  //Can we rewrite this method to static method? NO.we CANNOT.
  public String fullName(String lastName){
    return this.firstName + " " + lastName;
  }
}