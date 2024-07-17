package clazz;

import java.util.Objects;

public class Superman extends Person implements Flyable,PowerUP{

  public Superman(String name){
    super(name);//call parent class constructor
  }

  public Superman(){
    //super(); // implicitly calling Person()
  }

  @Override
  public void fly(){
    System.out.println("Superman is flying");
  }

  @Override
  public void powerup(){

  }

  @Override
  public boolean equals(Object obj){
    if(this == obj)
     return true;
    if(!(obj instanceof Superman))
      return false;
    Superman sm = (Superman)obj;
     return Objects.equals(super.getName(),sm.getName());
  }

  @Override
  public int hashCode(){
    return Objects.hash(super.getName());
  }

  @Override
  public String toString(){
    return "Superman= " + super.toString();
  }

  public static void main(String[] args) {
    //Inheritance only for instance method,attribute
    //Do not inherit constructor
    Superman sm = new Superman("John");
    //No Name attribute in Superman

    //Polymorphism
    Person p1 = new Superman("Vincent");
    //p1.fly();
    //During compile time,p1 cannot fly()
    //because p1 is declared by Person,which can call the instaned method from Person.class ONLY
    //fly() method is hidden when you use p1 to interact Superman Object
    p1.eat();

    Superman s1 = (Superman)p1;//Parant -> Child (downcast)
    //what is the risk?
    //p1 can be an object created by other class and this class extending Person.class as well
    s1.fly();

    //From programming perspective,if you want to elimiate risk,you can use instanceOf
    Superman s2;
    if (p1 instanceof Superman){
      s2 = (Superman)p1;
    }

    //equals()
    System.out.println(sm);
    Superman sm2 = new Superman("John");
    System.out.println(sm.equals(sm2));

    PowerUP superman = new Superman("Sally");//what is the point to use interface as object reference
    superman.powerup();

    Superman sm3 = (Superman)superman;
    superman.powerup();

    System.out.println(sm3.toString());

  }

}