public class Car {
  private static int count = 0;
  private int id;
  private String color;


  //Constructor can assess static variable
  public Car(String color){
    this.id = ++count;
    this.color = color;
  }

  public int getId(){
    return this.id;
  }

  public static void main(String[] args) {
    Car c1 = new Car("red");
    Car c2 = new Car("red");
    Car c3 = new Car("red");
    System.out.println(c3.getId());
  }
}
