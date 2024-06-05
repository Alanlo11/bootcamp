public class TestCat {
  public static void main(String[] args) {
    //Local variable
    String name = "John";

    //Local variable
    Cat c1 = new Cat();//new Cat()  produce a cat object in memory
    //memory address 0x123dasddfggfhbgf23fds
    //c1 -> object reference or variable ().able to find the cat object
    
    c1.setAge(10);
    c1.setName("ABC");
    System.out.println(c1.getAge());//10
    System.out.println(c1.describe());

    //Local variable
    Cat c2 = new Cat();
    c2.setAge(7);
    System.out.println(c2.getAge());//7
    System.out.println(c1.getAge());//10

  }
  
}