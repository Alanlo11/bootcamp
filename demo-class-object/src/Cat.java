public class Cat {//Class name  -> name convenrtion -> able to describe physical object
  //state狀態
  //attributes 

  //What is "this"?
  //attributes
  private String name;
  private int age;

  //if NO constructorm is defined
  //by default the Class implicitly has a empty constructor

  //behavior
  //instance method
  //setAge() is a method that can be called by OBJECT only
  //For example,Cat c1 = new Cat();
  //c1.setAge(13);
  //"this"-> the object pointed by c1(object reference)指定
  //void is a return type,requires return nothing
  public void setAge(int age){
    this.age = age;
  }

  public void setName(String name){
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

   //static method belongs to class
  //the purpose of static method -> produce something by the intput parameters
  //static method should not access any object attributes/behaviors
  public static String hello(){
    return "hello";
  }


  //instance method is able to access (read & write) the object attributes
  public String describe(){
    return "The age of the cat is " + this.age + ", and name of this cat is " + this.name;
  }

  public static void main(String[] args) {
    //object,using class to creata a object
    Cat cat = new Cat();


    Cat c3 = new Cat();
    System.out.println(c3.getAge());//0,because primitive defult 0
  }
}