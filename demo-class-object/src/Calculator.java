public class Calculator {

  //static method -> instance method
  public static int sum(int x,int y){
    return x+y;
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
    return this.x+y;
  }

  public double divide(){
    return this.x/y;
  }

  public int multiply(){
    return this.x*y;
  }

  public int subtract(){
    return this.x-y;
  }

  public static void main(String[] args) {
    sum(1,3);
    Calculator.sum(2, 3);

    Calculator c1 = new Calculator();
    c1.setX(2);
    c1.setY(3);

    System.out.println(c1.sum());
    System.out.println(c1.subtract());
    System.out.println(c1.multiply());
    System.out.println(c1.divide());
    System.out.println((double)2/3);

  }
  
}