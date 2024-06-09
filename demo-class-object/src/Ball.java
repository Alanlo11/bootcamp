public class Ball {
  private double weight;
  private String color;//String = char[]
  private int number;


  //by default,there is an empty constructor implicity exists in the class.
  //Custom empty constructor
  public Ball(){

  }

  public Ball(String color,double weight){
    this.color = color;
    this.weight = weight;
  }

  public Ball(String color,double weight,int number){
    this(color,weight); //call self constructor  call已寫的method
    this.number = number;
  }

  public void setColor(String color){
    this.color = color;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public String getColor(){
    return this.color;
  }

  public double getweight(){
    return this.weight;
  }

  public String toString(){
    return "Color is " + this.color + " weight is " + this.weight;
  }

 // public String toString(){
 //   return this.color + this.weight;
 // }

public static void main(String[] args) {
  Ball b1 = new Ball();//empty constructor to create a ball
  Ball b2 = new Ball("RED", 10.2);
  System.out.println(b2.toString());
  //未寫method之前會出呢堆野 "Ball@7344699f"   OBJECT Reference
  //寫左之後 "Color is RED weight is 10.2"
  
  
}
}
