package shape;

import java.math.BigDecimal;

public class Box {
  

  public static void main(String[] args) {
    

    BigDecimal bd = new BigDecimal(0.0d);
    bd.add(BigDecimal.valueOf(1.0d));
    System.out.println(bd.doubleValue());//0.0
    bd = bd.add(BigDecimal.valueOf(1.0d));
    System.out.println(bd.doubleValue());//1.0
    //add() = new BigDecimal

  }
}
