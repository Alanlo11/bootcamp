public class DemoBlock {
  private static int number;
  private static int number2;
  private String name;

  //係main之前就run
  //static block
  //1.Triggered once only,no matter of static variable(s)
  //一定會行
  static {
    System.out.println("start block");
    number = 3;
    Cat cat = new Cat();
    System.out.println("end block");
  }

  public DemoBlock(){
    System.out.println("calling empty constrcutor...");
  }

  public DemoBlock(String name){
    System.out.println("calling all args constrcutor...");
    this.name = name;
  }
  //instance block
  //1.it is triggered when there is new object created
  //2.it is triggered before constructor
  //3.Usage: common logic between constructors
  {
    System.out.println("start instance block");
    this.name = "John";
    System.out.println("end instance block");
    number = 10;
  }
  

  public static void main(String[] args) {
    System.out.println("start.");
    System.out.println(DemoBlock.number);//3

    DemoBlock db = new DemoBlock();
    DemoBlock db2 = new DemoBlock("John");
    DemoBlock db3 = new DemoBlock();
    System.out.println(DemoBlock.number);//10
    System.out.println("end");
  }
}
