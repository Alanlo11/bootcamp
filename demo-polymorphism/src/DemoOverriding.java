public class DemoOverriding {//dynamic polymorism(run-time)
  
  public static void main(String[] args) {
    //Example 1
    Animal animal = new Cat();
    //Compile time checks the scope of the object,but not the implementation
    animal.walk();//Cat is walking...
    // animal.run();//Compile error,because Animal.class has walk() ONLY.

    //During runtime,the new object is created in heap memory
    //then the object reference "animal" will point the cat object and execute walk() method
    //That is Cat.walk()


    //Example 2
    Animal animal2 = new Animal();
    //No relationship with Cat.class or Dog.class
    animal2.walk();//Animal is walking
    //Created Animal object,so it is Animal.class method

    //Example 3
    animal = new Dog();
    // animal.sleep();//compile error,because the object reference type determined the scope of the object.
    animal.walk();//Animal is walking,because Dog.class does not Override the walk() method.

  }
}