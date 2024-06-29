public interface Walkable {
  //Interface:
  //1. no instance variable
  //2. all methods are "public abstract" implicitly
  //3. you can still declare "public static final" implicitly
  //4. A class can implements more than 1 interface,it can only ectend one Parent class only

  //public static final int AGE = 3;
  //Constant
  int AGE = 3;

  //abstract void walk();
  void walk();

  //After Java 8,we have default method and static method in interface
  //can be Overriden
  //it's not final
  default void run(){
    System.out.println("Default i am running...");
  }

  static void swim(){
    System.out.println("static i am swimming...");
  }

}