public class Student extends Person{//abstract
  //Person.class is perent,while Student is child
  private int studentId;


  //constructor -> the process of construcstor student object
  public Student(int studentId, String name,int age){
    super(name,age);//calling Oarent class constructor...
    //1.create Parent Object inside Student Object (heap object)
    this.studentId = studentId;
    //this.name = name;
    //this.age = age;
  }

  //public String getName(){
  //  return this.name;
  //}

  public int getStudentID(){
    return this.studentId;
  }

  public void setAge(int age){
    //2.call parent object setAge() method
    super.setAge(age);
  }
  //public int getAge(){
  //  return this.age;
  //}

  public static void main(String[] args) {
    Student s = new Student(1, "Alan", 13);//Student object in heap memory
    System.out.println(s.getAge());
    System.out.println(s.getName());
    System.out.println(s.getStudentID());
  }
}
