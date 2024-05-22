import java.util.Arrays;

public class Demostring {
    public static void main(String[] args) {
        //String stores text "" 
        //double qoute to dececlare s String value
        String x = "Hello";
        String y = "!@#!@R0";
        String dollar = "$10";
        String withSpace = "H  Hello e    ";
        System.out.println(withSpace);
        String g = y+"fgfvyf"+x+dollar;
        String ooo = "ewffdsfrthfd";
        System.out.println(ooo);
        int u = 2343;
        System.out.println(u);
        System.out.println(u+ooo);
        
        //+
        String z = x + dollar;
        System.out.println(z);
        System.out.println(g);

        double price = 9.99;
        String item = "Book";
        String description = "The" + item + "cost $" + price; // string + string + double = string
        System.out.println(description);

        char a = 'A';
        String message = "The annswer is :" + a;
        System.out.println(message);

        //String Method (Tool1) X.lenght()
        String t = "hello";
        System.out.println("the lenght of t=" + t.length());

        if ((t.length())>=4)
        {System.out.println("hello");}
        else
        {System.out.println("goodbye");}

        // method equals()
        String s1 = "hello";
        String s2 = "hello";
        if(s1.equals(s2))
        {System.out.println("they are same");}
        else
        {System.out.println("no");}

        if(!s1.equals(s2)) //! means "NOT"
        {System.out.println("they are same");}
        else
        {System.out.println("no");}

        if(s1.length() >= 6 || s1.equals(s2))
        {System.out.println("Yes");}
        else
        {System.out.println("No");}

        if (s1.length()>=6) //b
        {System.out.println("Hello");}
        else if (s1.equals(s2))//c
        {System.out.println("World");}
        //&&
        if(s1.length() >= 6 && s1.equals(s2))
        {System.out.println("Yes");}
        else
        {System.out.println("No");}
        
        if(s1.length()>=6)
        {if(s1.equals(s2))
        {System.out.println("H");}}

        //me 3 chatAt(int dndex), charAt(0)
        String s3 = "world";
        System.out.println("1="+s3.charAt(0));
        // 0 = 第一個字
        //1 = means the second index
        //4 = means 5th character
        System.out.println("5="+s3.charAt(4));
        System.out.println("last character = " + s3.charAt(s3.length()-1));





        String x2 = "hello world";//char use ==,can not use equal
        if(x2.charAt(x2.length()-1) == 'd' && x2.length() == 11  )  
        {System.out.println("yes");}
        else
        {System.out.println("No");}

        //equal only use for string


        //tool4 substring(int beginindex,int endindex)window jsdd

        String result = x2.substring(0,2);
        System.out.println(result);
        System.out.println(x2.substring(0,3));
        System.out.println(x2.substring(3,8));
        System.out.println(x2.substring(0,1));
        

        String x3 = "welcome";
        if(x3.substring(0,3) .equals("wel"))
        System.out.println("wel");

        System.out.println(x3.substring(0,3).length());//3
        System.out.println(x3.substring(0,3).charAt(1));//e

        String x4 = x3.substring(0,3);
        int l1 = x4.length();
        System.out.println("l1="+l1);

        if (x3.charAt(0) == 'w'&& x3.charAt(1) == 'e' && x3.charAt(2)=='l')
        System.out.println("come");




        //isEmpty() 是否完全咩都冇
        //Empty Sting value = ""
        String x7 = "";
        System.out.println(x7.isEmpty());//true
        System.out.println(x7.length() == 0);//true

        String x8 ="abc";
        System.out.println(x8.isEmpty());//false


        //isBlank()  是否咩都冇
        String x9 = "";
        System.out.println(x9.isBlank());//true
        x9 = " ";
        System.out.println(x9.isBlank()); //true
        System.out.println(x9.isEmpty()); //false

        //subString(0,2)
        //subString (0)
        String s10 = "hello";
        System.out.println(s10.substring(0));//from index 0 to the end
        System.out.println(s10.substring(0,3));//from index 0 to 2 (3-1)  "hel"
        

        //toUpperCase()
        //hello -> HELLO
        System.out.println(s10.toUpperCase());//HELLO


        //toLwoerCase()
        String s11 = "Hello";
        System.out.println(s11.toLowerCase());//hello


        //replace("","")
        System.out.println(s10.replace("l", "x"));//hexxo
        System.out.println(s10.replace("ll", "1234"));//he1234o
        System.out.println(s10.replace("ll", "abc"));//hello

        //contains("") true false
        System.out.println(s10.contains("ell"));//true

        //startsWith()  check start
        System.out.println(s10.startsWith("he"));//true

        //endWith()   chrck end
        System.out.println(s10.endsWith("o"));//true

        //trim() 去晒頭尾space || removing the space characters at the head/tail of the String
        String s12 = " hello,  bootcamp  !!!   ";
        System.out.println("s12="+s12.trim());


        //how many strings contains "ELL", but ignore case
        //"eLL" or "eLl"...
        int xx = 0;
        String[] strings = new String[]{"hello","abcijk","vincent","Hello","  HELLO  "};
        for(int i=0 ; i<strings.length ; i++){
            if(strings[i].trim().toLowerCase().contains("ell")==true)
            xx++;
        }
            System.out.println("xx="+xx);


}
}