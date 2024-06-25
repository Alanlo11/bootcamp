import java.util.Objects;

public class Person {
  private int hkid;
  private String name;
  public static int id = 0;

   public Person (String name){
    this.name = name;
    this.hkid = ++id;
   }

   public int getHkid(){
    return this.hkid;
   }

  @Override
  public int hashCode(){
    return Objects.hash(this.name,this.hkid);
  }
}
