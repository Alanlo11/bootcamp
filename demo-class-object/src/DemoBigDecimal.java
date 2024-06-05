import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    double x = 0.2;
    double y = 0.1;
    System.out.println(x*y);//0.020000000000000004


    BigDecimal b1 = new BigDecimal("0.2");
    BigDecimal b2 = new BigDecimal("0.1");

    BigDecimal b3 =  b1.multiply(b2);
    System.out.println(b3.doubleValue());

    System.out.println(sum(0.2, 0.1));


    System.out.println(sum1(9.9, 3.0));//3.3
    System.out.println(sum1(9.9, 3.2));//3.094
    System.out.println(sum1(9.9, 3.1));//?

    System.out.println(sum1(1.0, 0.5));

    System.out.println(sum2(2.0,0.5));//先減後乘

    System.out.println(BigDecimal.valueOf(3.3)//
        .subtract(BigDecimal.valueOf(1.1)//
       .add(BigDecimal.valueOf(4.4))));

  }

  public static double sum(double d1,double d2){
    BigDecimal b1 = BigDecimal.valueOf(d1);
    BigDecimal b2 = BigDecimal.valueOf(d2);
    return b1.add(b2).doubleValue();
  }

  //Divide 除數
  //method
  public static double sum1(double d1,double d2){
    return BigDecimal.valueOf(d1).divide(BigDecimal.valueOf(d2).setScale(2,RoundingMode.UP)).doubleValue();//decmical place,the way to rounding
  }

  //d1.subtract().multiply() //先減後乘
  //- * 唔會先乘除後加減
  public static double sum2(double i,double y){
    return BigDecimal.valueOf(i).subtract(BigDecimal.valueOf(y)).multiply(BigDecimal.valueOf(y)).doubleValue();
  }


  
}