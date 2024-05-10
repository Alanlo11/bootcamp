public class DemoPrimitives{
    //public class (filenname)要一樣,大細階都要
    //
    public static void main(String[] args){
        // numbers /strings(text文字,不可以有數字)
        // number (integers整數/decimal)
        //int係數字,只可以整數
        //string係文字,"" 咩都可以
        //int is a data type that declaring the type of value of x can be stored
         //int y = 3.5;INT係整數
        int x = 4;
        int z = 2;
        int a = 6;
        int b = 3;
        int e = 5;
        int total = a + b;
        System.out.println(total);
        System.out.println(e);
        // +-*/
        int c = total - 10 + x;
        System.out.println(c);

        int k =a+x*8;
        System.out.println(k+z);

    //remainder

    int remainder = 10 % 3;
    int divide = 10/3;
    System.out.println(remainder); //1
    System.out.println(divide); //3

    //2024.05.10
    double d1 = 1.5;
    double d2 = 1.435;
    double d3 = -1.231235;
    double result2 = d1 + d2 + d3;
    System.out.println(result2);
    //double +-*/ 會有事

    double result3 = 0.1+0.2;
    System.out.println(result3);//0.30000000000000004

    double re4 = 2 + 4 * 0.25 * 3 / 2 - 10;
    System.out.println(re4);

    int f1 = 7;
    double f2 = 8.8;
    double f3 = f1 + f2;
    System.out.println(f3);//error,because int + double = double + double 7.0 + 8.8
                            //so double value can be stored in an int variable
                            
    int g = 10 / 3; //int/int ,so 3 can be assigned to variable

    //Primitive char
    char c1 = '!';//single quote ' deckarew a char value只可以擺一個
    char c2 = ' ';
    //char c3 = '@';char variabel must contain a single character
    //char c4 = 'aa';

    // Primitive boolean  -> true,false唔可以有符號/其他野
    // boolean b1 = ; //
    boolean b2 = true;
    boolean b3 = false; 
    //boolean b4 = 1;

    //primitive for integer
    //int long byte short
    //byte can only store the int with range -128 to 127(2^x)
    byte y1 = 1;
    byte y2 = -128;
    byte y3 = 127;
    

    short s1 = -32768;
    int i1 = -2147483648;// -2147483648 to 2147483647
    long l1 = -9223372036854775808L;//-9223372036854775808 = int理論上會係INT
    //L means a way to specify this value is a long value

    //primitives for number with decimal
    //1.10.2 = double value 
    //2.you caanot assign a double to a float variable,because float is with lower level then data type
    //3.in conclude,you cannot a higher level of data level value to a lower level data type 
    double b10 = 10.2;
    //10.2f is a float value
    float f10 = 10.2f;

    double f11 = 10.5 + 10.5; // float + double = double,so can't ok因為唔可以降level

    double d11 = 99.99d;//same as double d12=99.99
    //local variable (within the main program,you can only declare the same variable once)
    double d12;//varible declaration
    d12 = 10.9;//value assignment
    double d13 = 14.3;//declaration and assignment
    //byte y4 = 128;compile error (java can identify the syntax error)

    d13 = 19.0;//reassignment
    //double d13 = 19.0;//you cannot re-declare the same variable



    }
}