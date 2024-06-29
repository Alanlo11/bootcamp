public class Human extends SuperHuman implements Walkable,Readable{

  //Class can only inherit methods,instance variables
  //Constructor CANNOT be inherited

  public Human(double height){
    super(height);//SuperHuman's constructor
  }

  public Human(){
    
  }

  @Override
  public void walk(){
    System.out.println("Human is walking...");
  }

  @Override
  public void read(){
    System.out.println("Human is Reading...");
  }

  // @Override
  // public double getHeight(){
  //   return super.getHeight() + 1;
  // }

  public static void main(String[] args) {
    System.out.println(Walkable.AGE);//3,public static final value

    Human h1 = new Human(178.5);
    h1.walk();
    h1.read();;
    h1.run();//default i am running
    System.out.println(h1.getHeight());

  }
}