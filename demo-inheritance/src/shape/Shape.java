package shape;

import java.math.BigDecimal;

public abstract class Shape {
  //abstract class can create instance method whitout implementation
  //method without implementation -> abstract method
  public abstract double area();

  public static double circleArea(double radius){
    return BigDecimal.valueOf(radius).multiply(BigDecimal.valueOf(radius).multiply(BigDecimal.valueOf(Math.PI))).doubleValue();
  }


  // public static double totalArea(Circle[] circles){

  // }

  // public static double totalArea(Square[] squares){
    
  // }

  //chapter 17
  public static double totalArea(Shape[] shapes){
    BigDecimal bd = BigDecimal.valueOf(0.0d);
    for(Shape s : shapes){//s is a object reference,point to actual object (circle,square)
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  public static void main(String[] args) {
    System.out.println(Shape.circleArea(3.0d));
    Shape[] shapes = new Shape[]{new Circle(3.0d),new Square(4.0d),new Circle(10.0)};
    System.out.println(Shape.totalArea(shapes));
  }
}
