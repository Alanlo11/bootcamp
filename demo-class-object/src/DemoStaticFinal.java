public class DemoStaticFinal {

  //constant 固定不變既野 //snakecase 
  //logoString //camelcase
  private static final String LOGO_STRING ;//static vairables,finalized
  private static String name;//static variable
  private final double salary = 0.0d;//finalized instance variables

  //camelcase
  private int age;//instance variable

  //triggered before main () method
  static{
    LOGO_STRING = "default";
  }

  public int getAge(){
    return this.age;
  }

  public double getSalary(){
    return this.salary;
  }

  //belong to class
  public static String getName(){
    return name;
  }

  //instance method can access both instance varible and static variable
  public String test(){
    return this.age + " " + name +  " " + this.salary + " " + LOGO_STRING;
  }

  public static String getLogo(){
    return LOGO_STRING;
  }

  //final is a keyword.Compiler would check all final variables have been initialized

  public static void main(String[] args) {
    //instance variables
    DemoStaticFinal dsf = new DemoStaticFinal();
    dsf.age = 10;
    //dsf.salary = 1000; //compile error,salary is a final variable
    System.out.println(dsf.salary);//0.0
    DemoStaticFinal dsf2 = new DemoStaticFinal();
    dsf2.age = 20;
    System.out.println(DemoStaticFinal.LOGO_STRING);//default

    DemoStaticFinal.name = "as";
    System.out.println(DemoStaticFinal.name);

    //you cannot assign "static final"variable in main() method,its too late
    //LOGO_STRING = "default"
  }
  
}