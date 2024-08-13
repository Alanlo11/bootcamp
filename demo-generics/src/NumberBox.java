import java.math.BigDecimal;

public class NumberBox<T extends Number> {
  private T number;

  public NumberBox(T number){
    this.number = number;
  }

  public static void main(String[] args) {
    NumberBox<Byte> byteBox = new NumberBox<Byte>((byte) 1); // int -> byte -> Byte  Auto-Box

    // Long extends Number and Byte extends Number
    // NumberBox<Byte> has no relationshup with NumberBox<Long>
    // byteBox = new NumberBox<Byte>(Long); // NOT OK

    NumberBox<BigDecimal> bBox = new NumberBox<BigDecimal>(BigDecimal.valueOf(3.4));

  }
}