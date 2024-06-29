package parent;

public class Father {
  private String name;
  
  public Father(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }
  
  public Father(){

  }

  public static void main(String[] args) {
    Father f1 = new Father("aa");
    System.out.println(f1.getName());
  }
}
