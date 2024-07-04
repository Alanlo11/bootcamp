public enum Currency {
  HKD("Hong Kong Dollar.",1),//similar to new currency("")
  USD("US Dollar",2),
  JPY("YEN",3),
  ;

  //instance variable
  private final String description;
  private final int DBValue;

  //Constructor
  private Currency(String description,int DBValue){
    this.description = description;
    this.DBValue = DBValue;
  }

  //instance methods
  public String getDescription(){
    return this.description;
  }

  public int getDBValue(){
    return this.DBValue;
  }

  @Override
  public String toString() {
    return "Currency(" //
        + "description=" + this.description //
        + "DBValue=" + this.DBValue //
        + ")";
  }

  // HKD,2 ->USD, 3 -> JPY,1
  public static Currency get(int DBValue){
    for(Currency curr : Currency.values()){
      if(DBValue == curr.getDBValue())
      return curr;
    }
    return null;//throw exception
  }

  public static int get(Currency currency){
    return currency.getDBValue();
  }

  public static String fullDescription(Currency currency){
  //   if(currency == Currency.HKD){
  //     return "It is Hong Kong Dollar.";
  //   }else if(currency == Currency.USD){
  //     return "Hello wao";
  //   }else if(currency == Currency.JPY){
  //     return String.valueOf(currency.getDBvalue());
  //   }
  //   return null;
  // }

  //Alternative:switch (before java14) + enum (perfect match)

  switch (currency){
    case HKD:
    return "it is hong kong dollar";
    case USD:
    return "USD";
    case JPY:
    return String.valueOf(currency.getDBValue());
    default:
    return null;
  }
}

  public static void main(String[] args) {
    // Currency currency = Weekday.Monday;
    Currency currency = Currency.HKD;
    Currency currency2 = Currency.USD;
    
    if(currency == Currency.USD){
      System.out.println("it is " + currency.getDescription());
    }else if(currency == Currency.HKD){
      System.out.println("it is " + currency.getDescription());
    }else if(currency == Currency.JPY){
      System.out.println("it is " + currency.getDescription());
    }

    System.out.println(currency.getDBValue());
    System.out.println(currency2.getDBValue());

    System.out.println(currency);//HKD

    //ENUM already override Object to.String()
    System.out.println(currency.toString());//HKD

    //default instance methods provided by ENUM.class
    System.out.println(currency.name());//HKD

    // 2.values(){
    for(Currency c : Currency.values()){
      System.out.println(c.getDescription());//YEN,3
      }

      System.out.println(Currency.values().length);//3
      System.out.println("value"+Currency.values());

      System.out.println(Currency.HKD.hashCode());//2124308362
      System.out.println(Currency.USD.hashCode());
      
      System.out.println(Currency.HKD.equals(currency));//true
      System.out.println(Currency.USD.equals(currency2));

      

      
      System.out.println(currency != null && currency.equals(Currency.HKD));

      String x = "abc";
      //not OK
      if(x.equals("abc")){//potenially null pointer execption

      }

      if("abc".equals(x)){//false or true

      }

     System.out.println(Currency.get(2));//toString(),Currency(desciption=US Dollar.DBvalue=2)
      
      

     //enum advantages

     //3. valueOf() -> static method
     System.out.println(Currency.valueOf("HKD").name());//"HKD","HKD"->Currency enum->name()->"HKD"
    //  System.out.println(Currency.valueOf("123").name());//java.lang.IllegalArgumentException

  }
}