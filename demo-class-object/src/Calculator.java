import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

  //static method -> instance method
  public static int sum(int x,int y){
    System.out.println("int,int");
    return x+y;
  }

  public static double sum(double x,double y){
    System.out.println("double,double");
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }

  public static double sum(float x,double y){
    System.out.println("float,double");
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }


  private int x;
  private int y;

  public void setX(int x){
    this.x = x;
  }

  public void setY(int y){
    this.y = y;
  }

  public int sum(){
    return this.x + this.y;
  }

  public double divide(){
    return BigDecimal.valueOf(this.x).divide(BigDecimal.valueOf(this.y),5,RoundingMode.HALF_UP).doubleValue();
  }

  public int multiply(){
    return this.x*y;
  }

  public int subtract(){
    return this.x-y;
  }

  public static void test(String[] args){
    //basic
    for(int i=0 ; i<args.length ; i++){
      System.out.println(args[i]);
    }

  }

  public static void test2(String... args){ //String...->String[] same type 完全一樣的
    //for-each
    for(String s : args){
      System.out.println(s);
    }
  }

  public static void main(String[] args) {
    sum(1,3);
    Calculator.sum(9, 3);

    Calculator c1 = new Calculator();
    c1.setX(2);
    c1.setY(3);

    System.out.println(c1.sum());
    System.out.println(c1.subtract());
    System.out.println(c1.multiply());
    System.out.println("divide=" + c1.divide());
    System.out.println((double)2/3);

    sum(1,2);
    sum(1.0,2.0);
    sum(1.0f,2.0f);

    //String.valueOf() -> overloading 入面唔同參數就會自動對應參數類型(如有，冇就會揀最接近)

    Calculator.test(new String[] {"abc","ijk"});
    Calculator.test2(new String[] {"abc","ijk"});
    Calculator.test2("abc","ijk");
  }
  
}