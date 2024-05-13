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
    } 
}