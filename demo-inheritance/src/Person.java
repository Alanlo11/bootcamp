public class Person { //abstract 
  private String name;
  private int age;
  
  public Person(String name,int age){
    this.name = name;
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  public static void main(String[] args) {
    Person p = new Person("Alan", 13);

    //Student.class is public
    //Student.class constructor is public
    Student s = new Student(1, "Alan", 13);
  }
}
