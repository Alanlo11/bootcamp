public class DemoStringBuilder {
  public static void main(String[] args) {
    String x = "hello";//slow performance. i.e. concat, replace

    //"new StringBuilder()" ->constructor
    StringBuilder sb = new StringBuilder("hello");//fast performance
    Cat cat = new Cat();
    cat.setAge(13);//void method

    x += "world";
    sb.append("world"); //same as x += "world";

    System.out.println(sb.toString());//helloworld
    sb.replace(1, 2, "xx");//return StringBuilder Object
    System.out.println(sb.toString());

    sb.setCharAt(4, 'A');
    System.out.println(sb.toString());

    sb.reverse();
    System.out.println(sb.toString());

    sb.insert(4, '*');
    System.out.println(sb.toString());

    String s = sb.substring(1,3);
    System.out.println(s);
    System.out.println(sb.toString());
    
    //insert,delete,setCharAt()

  }
  
}
