public class Password implements Secret{
  private String password;

  Password(String x){
    this.password = x;
  }

  @Override
  public void show(){
    System.out.println("123");
  }

  public static void main(String[] args) {
    Password p2 = new Password("hello");
    p2.show();
  }
}
