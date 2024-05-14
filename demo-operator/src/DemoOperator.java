public class DemoOperator {
    public static void main(String[] atgs){
        int x =3;

        x = x + 1;
        System.out.println("x="+x); //string + int = string
        x++; //same x = x+1
        System.out.println("x="+x);

        x +=1;//same as x =x+1
        System.out.println("x="+x);

        x +=2; // x+2
        System.out.println("x="+x);
        
        ++x;//x=x+1
        System.out.println("x="+x);


        ++x;//same as = x + 1

        int y= 4; //4
        y=y-1; //4-1
        y--;//3-1
        --y;//2-1
        y-=1;//1-1
        System.out.println("y="+y);

        //*= 
        int p =4;
        p = p * 2;//8
        p *=2;//16
        p /=4;
        System.out.println(p);//4
        // /=
        int z = 10;
        z = z%3;
        int j = 10;
        j %=3; //1
        System.out.println("z="+z+",j="+j);

        String s = "hello";
        s = s +"world";
        s+="!!!";
        System.out.println("s="+s);

        // no ** //
        // > , < >= <=
        boolean r1 = 10>3; //true
        boolean r2 = 4>10; //false
        boolean r3 = 10>=10;
        boolean r4 = -9<=9;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        //and(&&),or(||)
        boolean r5 = 10>3&&20>=20;//true + true =true
        boolean r6 = 10>3&&4<4; //true + false = false
        
        boolean r7 = 10>3 || 20>=20; // true + true =true
        boolean r8 = 10>3 || 20<18; //true or false = true
        boolean r9 = 3>10 || 20<18; //false or false = false
        System.out.println("r8="+r8);

        char c10 = 'a';
        char c11 = 'B';
        boolean r10 = c10 == c11; //false//asking if a value = value we use ==,一個"="係指assign
        boolean r11 = 'C' !='0';// !=係指唔等於


        boolean r12 = 10 /2 > 5*3;//false
        System.out.println("r12="+r12);

        int r13 =30;//30
        r13 +=1;
        System.out.println("r13="+r13);


        int n =3;
        int result11 = n++ * 3 + n++;//n * 3 first,....result = 9,之後先n = n + 1,如果之後冇野,就呢到完
        System.out.println("n="+ result11);//9+4=13

        int m=4;
        int result22 = ++m * 5;//m = m+1 first,* 5..25
        System.out.println("m="+result22);
        

        int k =4;
        int result33 = k++ * 7 * ++k;// (4 * 7) * 6 //168
        System.out.println(result33);

        

    }
}
