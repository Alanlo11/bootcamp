package parent;

public class Child extends Father{
private String name;
  //implicitly empty constructor
  public Child(String name){
    // super(name); //意思係this.name = name; 但用左繼承
    // super("Father");//by dafault is "Father"
    super(name);
  }

  //method都要寫，但可以用super繼承
  //但唔寫都用到，因為個name都係繼承返黎，如果係用thisname = name;就一定要寫個新既，唔可以用super
  // public String getName(){
  //   return super.getName();
  // }
  
  public static void main(String[] args) {
    Child c = new Child("alan");
    Father f = new Father();
    Father f2 = new Child("John");
    // Child c2 = new Father(); // not allowd,parent object cannot be assigned to child reference type

    int i = 1;//x -> int object reference type,i -> int value
    Child c1 = new Child("qqq");
    System.out.println(c1.getName());
  }

}