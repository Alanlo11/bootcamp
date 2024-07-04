public enum Month {
  JANUARY(0),
  FEBUARY(1),
  MARCH(2),
  APRIL(3),
  MAY(4),
  JUNE(5),
  JULY(6),
  AUGEST(7),
  SEPTEMBER(8),
  OCTOBER(9), 
  NOVEMBER(10),
  DECEMBER(11),
  ;

  private int number;
  
  private Month(int number){
    this.number = number;
  }

  public String getMonth(){
    return this.name();
  }

  public Month nextMonth(){
    for(Month month : Month.values()){
      if((this.number+1)%12 == month.number)
      return month;
    }
    return null;
  }

  public static Month nexMonth(Month month){
    for(Month nextMonth : Month.values()){
      if((month.number+1)%12 == nextMonth.number)
      return nextMonth;
    }
    return null;
  }

  public static void main(String[] args) {
    System.out.println(Month.APRIL.nextMonth());
    System.out.println(nexMonth(Month.MARCH));
    System.out.println(Month.DECEMBER.nextMonth());
    System.out.println(nexMonth(Month.DECEMBER));

  }
}
