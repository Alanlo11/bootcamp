import java.time.LocalDate;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    //17type (8 primitive + 8 wrapper classes + String)
    //simliar to valueOf
    LocalDate ld = LocalDate.of(2022, 12, 31);
    System.out.println(ld.toString());
    System.out.println(ld);//same as toSting

    //LocalDate ld2 = LocalDate.of(2022, 12, 32);DateTimeException
    System.out.println(ld.plusDays(1L));//int -> long (upcast)
    System.out.println(ld.plusMonths(3L));
    System.out.println(ld.plusYears(2L));
    System.out.println(ld.plusWeeks(1L));
    System.out.println(ld.minusDays(100L));

    Month month = ld.getMonth();
    String monthString = month.toString();
    System.out.println(ld.getMonth());
    System.out.println(ld.getMonth().toString());

    System.out.println(ld.getYear());
    System.out.println(ld.getDayOfMonth());
    System.out.println(ld.getDayOfYear());
    System.out.println(ld.getDayOfWeek());
  }
  
}