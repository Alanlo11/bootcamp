import java.util.Scanner;

public class DemoObject {
  
  public static void main(String[] args) {
    //getClass()
    StringBuilder sb = new StringBuilder();//java.lang.StringBuilder
    Scanner scanner = new Scanner(System.in);//java.util.Scanner

    Object object  = new Object();//Object is a super parent 萬能指針,最頂層
    object = "abc";
    object = Double.valueOf(1.0);
    object = new Cat();

    //All Classes extends Object.class. Inher all methods from Object.class
    System.out.println(new Cat().toString());//"i am a cat"
    System.out.println(new Dog().toString());//Dog@1b6d3586
    //toString() 本身就有，自動return object address

    //Object.hastCode()
    //generate an int value by object reference ->1163157884
    Cat c1 = new Cat();
    System.out.println("c1= " + c1.hashCode());//1163157884
    //hashCode Object address turn to a int value
    Cat c2 = new Cat();
    System.out.println("c2= " + c2.hashCode());//325040804

    String x1 = new String("abc");
    System.out.println(x1.hashCode());//96354
    String x2 = new String("abc");
    System.out.println(x2.hashCode());//96354

    MiniCat mc = new MiniCat("John","RED");
    MiniCat mc2 = new MiniCat("John","RED");
    MiniCat mc3 = new MiniCat("Peter","RED");
    System.out.println(mc.hashCode());
    System.out.println(mc2.hashCode());
    System.out.println(mc3.hashCode());

    Person s1 = new Person("Alan");
    Person s2 = new Person("Alan");
    System.out.println(s1.hashCode());//63343882
    System.out.println(s2.hashCode());//63343883

    Object cat = new Cat();
    //call method 係由指針類型決定(Object)，因為呢個係belongs to Object，所以call唔到cat入面既method
    //只可以call Object method
    //cat(object reference) indeed pointing to cat object
    //run() instance method can only be called by object declared by Cat.class
    //if the object reference is declared bt Object.class,it cannot call run() method
    //cat.run(); //compile error

    //downcast
    Cat cat2 = (Cat) cat;
    //Reason why compile error: Jave compiler cannot guarentee Cat
    //compile time只在乎類型，run先會知有冇事
    //run time error
    cat2.run();
    //呢個位就可以用，因為佢係Cat Object既指針

    //Cat.class inherit Object.class
    //因為object係老豆Cat係子，所以cat可以用埋object既method
    cat2.hashCode();
    cat2.equals(cat);

    //cat & cat2 分別在於Object & Cat,Type唔一樣

  }

  //Java:Ensure Type Safty during compile time
  // public static Object sum(Object x,Object y){
  //   return x + y; //"+" operations -> String , int , Integer , double ,etc...
  // }

  public static int length(String x){
    return x.length();
  }

  //During compile time,Compiler cannot ensure the object in heap is a String object
  // public static int length2(Object x){
  //   return x.length();
  // }
}
