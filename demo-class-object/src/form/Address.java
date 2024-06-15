package form;
public class Address {
  private String line1;
  private String line2;
  private String line3;
  //all argument constructor,getter
  Address(){

  }

  Address(String line1,String line2,String line3){
    this.line1 = line1;
    this.line2 = line2;
    this.line3 = line3;
  }

  public void setLine1(String line1){
    this.line1 = line1;
  }

  public void setLine2(String line2){
    this.line2 = line2;
  }

  public void setLine3(String line3){
    this.line3 = line3;
  }

  public String getLine1(){
    return this.line1;
  }

  public String getLine2(){
    return this.line2;
  }

  public String getLine3(){
    return this.line3;
  }

  public String toString(){
    return this.line1 + this.line2 + this.line3;
  }

  //create a Form Object,with Address object
public static void main(String[] args) {
  Form f1 = new Form();
  Address a1 = new Address("abc", "def", "123");
  f1.setAddress(a1);
  f1.setFirstName("Alan");
  f1.setLastName("Lo");
  System.out.println(f1);//call toString()
}
  
}
