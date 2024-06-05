import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  private String firstName;
  private String lastName;

  private double weight;
  private double heigh;


  //get setter
  public void setWeight(double weight){
    this.weight = weight;
  }

  public void setHeigh(double heigh){
    this.heigh = heigh;
  }

  public double getWeight(){
    return this.weight;
  }

  public double getHeigh(){
    return this.heigh;
  }

  public double bmi(){
    return BigDecimal.valueOf(this.weight)//
    .divide(BigDecimal.valueOf(Math.pow(this.heigh, 2)),RoundingMode.HALF_UP).doubleValue();
  }

  //Attributes Presentation
  public String fullName(){
    return this.firstName + " " + this.lastName; 
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setLastName (String lastname){
    this.lastName = lastname;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public static double bmi(double weight,double heigh){
    return BigDecimal.valueOf(weight).divide(BigDecimal.valueOf(Math.pow(heigh, 2)),RoundingMode.HALF_UP).doubleValue();
  }

  //static method
  public String toString(){
    return "Person first name is " + this.firstName + "last name " + this.lastName + "weight" + this.weight + "high" + this.heigh; 
  }

  //Empty constructor
  //默認左
  public Person(){
  }

  //All Arguments Constructor
  public Person(String firstName,String lastName,double weight,double height){
    this.firstName = firstName;
    this.lastName = lastName;
    this.weight = weight;
    this.heigh = height;
  }


  public static void main(String[] args) {
    //Person() is a consturtor
    Person p1 = new Person();//Person() create a person object in memory
    //create a person object with given attribute values
    Person p2 = new Person("jenny", "chan", 55, 1.7);
    System.out.println(p2.fullName());
    System.out.println(p2.bmi());//19
    p2.setWeight(54);
    System.out.println(p2.bmi());//18.7

    p1.firstName = "Alan";
    p1.lastName = "Lo";
    p1.setHeigh(1.7);
    p1.setWeight(65);
    System.out.println(p1.fullName());
    System.out.println("p1's bmi=" + p1.bmi());
    System.out.println(Person.bmi(65, 1.7));
    System.out.println(p1.toString());


    Person p3 = p1;
    System.out.println(p1.getFirstName());
    System.out.println(p3.getFirstName());

    Person p4 = new Person();

  }

  
}
