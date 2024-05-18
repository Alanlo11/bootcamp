public class A {
    public static void main(String[] args){
        int a=10;
        int b=70;
        if (a>=b){
            System.out.println("Max="+a);}
            else{System.out.println("Max="+b);}

        int c = -1100;
        int d = -10000;
        int e = -77100;
        int f = -93939;
        int g = 1000;
            if(c<d&&c<e&&c<f&&c<g)
            {System.out.println("Min="+c);}
            else
            if(d<e&&d<f&&d<g)
            {System.out.println("Min="+d);}
            else
            if(e<f&&e<g)
            {System.out.println("Min="+e);}
            else
            if(f<g)
            {System.out.println("Min="+f);}
            else
            {System.out.println("Min="+g);}

         int h = 15;
         int i = 18;
         int p = 14;
            if(p>i||p>h)
            {System.out.println(p);}
            else
            {System.out.println(i);}
        
        boolean b1 = i>h&&i>p;
        System.out.println(b1);

        String s1 = "hello";
        String s2 = "hello";
            if(s1.length()>=5)
            System.out.println("1");
            if(s1.equals(s2))
            System.out.println("2");


            int aa = 10;
            int bb = 11;
            int cc = 12;
        
            if(aa==10)
            if(bb==11)
            {System.out.println("aabb");}
            if(cc==12)
            {System.out.println("aacc");}
             System.out.println(aa++ * 1 );



    } 
}