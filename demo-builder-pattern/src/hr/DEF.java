package hr;

import java.math.BigDecimal;

// implicitly imported all class under java.lang
public class DEF {
  public static void main(String[] args) {
    BigDecimal bd = new BigDecimal(5.0); // Manual import
    
    Math.abs(-5); // Auto-import, because it is under java.lang
    Integer x = 5; // java.lang
    String s = "h"; // java.lang
  }
}
