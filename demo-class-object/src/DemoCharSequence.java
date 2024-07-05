public class DemoCharSequence {
  public static void main(String[] args) {
    String s = "abc";
    System.out.println(s.length());//3
    s.replace("c", "a");//aba
    String s3 = s;//type-safe

    CharSequence cs = "abc";//Run time會發現自己指住String隻Object
    //但佢入面既method比string少，呢個情況叫hidden
    //左邊永遠窄過右邊
    System.out.println(cs.length());//3(Polymorphism)
    //Compiple-time determine the scope of object can be accessed by "cs"
    System.out.println(cs.charAt(1));//b
    //cs.replace();  error,replace() is not included in CharSequence Interface
    //Some of methods in String object is hidden by "cs".

    // String s2 = cs; // compiler concerns the type of "cs" ONLY
    //compile time cannot realize the actual object reference by "cs"

    //both Parent Class and Interface relationship can apply "downcasting"
    String s2 = (String) cs;
    //during compile-time,we don't guarantee if the casting will be successful.
    
    //As java developer,you may use "instanceOf" to ensure the type-safety
    if(cs instanceof String){
      s2 = (String) cs;
    }

    System.out.println(s2.replace("b", "a"));

    StringBuilder sb = new StringBuilder("hello");
    System.out.println(sb.length());//5
    System.out.println(sb.charAt(1));//e
    System.out.println(sb.reverse());//olleh

    CharSequence cs3 = new StringBuilder("hello");
    System.out.println(cs3.length());//5
    System.out.println(cs3.charAt(1));//e
    // System.out.println(cs3.reverse());//hidden 指針範圍冇

    // StringBuilder sb2 = (StringBuilder)cs;
    //run-time error,cs refer to String object
    //while object reference sb2 is StringBuilder

  }
}
