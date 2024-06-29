public class DemoEnum {

  //Constant(finite)
  //Weekday
  public static final String monday = "Monday";
  public static final String tuesday = "Tuesday";
  public static final String wednesday = "Wednesday";
  public static final String thursday = "Thursday";
  public static final String friday = "Friday";
  public static void main(String[] args) {
    System.out.println(DemoEnum.monday);

    //what heppen in heap memory?
    //Answer: static variable would not point to object

    //Before executing the main method being excuted,it loads enum.Class
    System.out.println(Weekday.Monday);//sysout -> calling Weekday Monday.toString().
    //by default Weekday.Class already @Override toString().
    System.out.println(Weekday.Tuesday);
    System.out.println(Weekday.Wednesday);
    System.out.println(Weekday.Thursday);
    System.out.println(Weekday.Friday);

    //Other example ?
    //east south west north
    Direction d = Direction.East;
    if(d == Direction.North){
      
    }

  }
}
