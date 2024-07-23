public class Customer {
  private int age;
  private String name;

  public Customer(int age,String name){
    this.age = age;
    this.name = name;
  }
  
  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setName(String name){
    this.name = name;
  }

  @Override
  public String toString(){
    return "Name:" + this.name + " Age:" + this.age;
  }
}
