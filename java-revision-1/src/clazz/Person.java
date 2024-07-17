package clazz;

public class Person {

  private String name;//if you use public here,it implies the source value can be read and replaced by others

  //Constant
  public static final double PI = Math.PI;

  public Person(){

  }

  public Person(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void eat(){

  }

  public String toString(){
    return "Person name= " + this.name;
  }

}
