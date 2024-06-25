package shape;

import java.math.BigDecimal;

public class MiniCircle extends Circle{

  private String color;
  
  public MiniCircle(double radius,String color){
    super(radius);
    this.color = color;
  }

  // @Override
  // public double area(){
  //  return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(Math.PI))).doubleValue();
  // }
  

  public static void main(String[] args) {
    MiniCircle mc = new MiniCircle(3.0d,"RED");
    System.out.println(mc.getRadius());
    System.out.println(mc.area());

    //extra example (BigDecimal vs StringBuilder Design defference)
    StringBuilder sb = new StringBuilder("hello");//StringBuilder return "this"
    sb.append("world");//Java:You don;t have to assign the return object to a reference.
    System.out.println(sb);

  }
}