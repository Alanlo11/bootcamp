package form;
public class Form {
  private String firstName;
  private String lastName;
  private Address address;
  //construtor get,setter
  Form(String firstName,String lastName,Address address){
    this.firstName = firstName;this.lastName = lastName;this.address = address;
  }

  Form(){
  }

  public void setFirstName(String firstname){
    this.firstName = firstname;
  }

  public void setLastName(String lastname){
    this.lastName = lastname;
  }

  public void setAddress(Address address){
    this.address = address;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public String getFullName(){
    return this.firstName + this.lastName;
  }

  public String toString(){
    return "address:" + this.address + " First Name:" + this.firstName + " Last Name:" + this.lastName;//call this.address.toString()
  }


  public static void main(String[] args) {
    Form f1 = new Form();
    Address a1 = new Address("abc", "def", "123");
    f1.setAddress(a1);
    f1.setFirstName("Alan");
    f1.setLastName("Lo");
    System.out.println(f1);


    

  }
}