package parent;

public class Child extends Father{

  //implicitly empty constructor
  public Child(String name){
    // super();
    // super("Father");
  }
  
  public static void main(String[] args) {
    Child c = new Child("alan");
    Father f = new Father();
    Father f2 = new Child("John");
    // Child c2 = new Father(); // not allowd,parent object cannot be assigned to child reference type

    int i = 1;//x -> int object reference type,i -> int value
  }
}