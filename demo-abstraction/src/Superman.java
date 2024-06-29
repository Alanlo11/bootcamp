public class Superman implements Walkable{
  @Override
  public void walk(){

  }

  @Override
  public void run(){
    System.out.println("Superman is running...");
  }

  public static void main(String[] args) {
    Superman superman = new Superman();
    superman.run();
  }
}