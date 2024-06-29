package EX;

public class Ex1 implements Ex2,Ex3{
  static String s = "Old McDonald";

  static boolean is(String is){
    return is.contains(s);
  }

  @Override
   public void abc(){
    System.out.println("ex1 running");
  }

  
  public static void main(String[] args) {
    System.out.println(Ex1.is("abc"));

    String s1 = "abc";
    String s2 = "ee";
    System.out.println(s1.contains(s2));
    System.out.println(s1.concat(s2));
    Ex1 ex = new Ex1();
    ex.abc();

  }
}