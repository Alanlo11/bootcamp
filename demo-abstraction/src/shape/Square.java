package shape;

import java.math.BigDecimal;

public class Square implements Shape{
  private double length;

  public Square(double length){
    this.length = length;
  }

  @Override
  public double area(){
    return BigDecimal.valueOf(length).multiply(BigDecimal.valueOf(length)).doubleValue();
  }
}