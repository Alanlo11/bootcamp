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

        //tool4 substring(int beginindex,int endindex)

        String result = x2.substring(0,2);
        System.out.println(result);
        System.out.println(x2.substring(0,3));
        System.out.println(x2.substring(3,8));
        System.out.println(x2.substring(0,1));
        

        String x3 = "welcome";
        if(x3.substring(0,3) .equals("wel"))
        System.out.println("wel");

        String x4 = x3.substring(0,3);
        int l1 = x4.length();
        System.out.println("l1="+l1);

        if (x3.charAt(0) == 'w'&& x3.charAt(1) == 'e' && x3.charAt(2)=='l')
        System.out.println("come");


}
}
