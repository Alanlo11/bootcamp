public class DemoInteger {
    public static void main(String[] args) {
        int x=1;
        Integer x2 = 1;
        System.out.println(x);
        System.out.println(x2);

        x = x+3;
        x -= 10;
        x2 = x2 +3;
        x2 -= 10;

        //integer is a wrapper class
        //class has method
        short s = (short) x;

        x2 += 60000;
        short s2 = x2.shortValue();//overflow,similar to explicit conversion
        System.out.println(s2);

        double d1 = x2.doubleValue();
        System.out.println(d1);

        //Comparsion (>, <, >=, <=, ==, != for primitive value only)
        //for integer wrapper class camparsion,compareTo()
        Integer x3 = 4;//autobox 因為係wrapperclass上唔係完整指令，會自動將primitive autobox去wrapperclass
        Integer x4 = 8;
        Integer x5 = 8;
        boolean result = x4 > x3;//true (compare int value)

        System.out.println(x4.compareTo(x3));
        System.out.println(x3.compareTo(x4));
        System.out.println(x4.compareTo(x5));

        boolean result2 = x4.compareTo(x3) > 0;//true  compare integer value
        boolean result3 = x4.compareTo(x3) < 0;//false
        boolean result4 = x4.compareTo(x5) == 0;//true
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        //Byte,Short,Integer,Long,Double,Float
        //
        Float f1 = 10.0f;//10.0f is a float value -> autobox ->Float volue(由primitive上wrapperclass)
        Float f2 = new Float(10.0f);//create Float object,storing a float value
        long l2 = f2.longValue();//新式寫法，直接係後面加.XXXvalue
        Float f3 = f1.floatValue();
        
        double d3 = new Double("10.3");
    
        Character c1 = new Character('a');
        char c2 = Character.toUpperCase('b');//static method
        System.out.println(c2);

        //compareTo() method is used to compare the boolean value stored in Boolean object
        Boolean b3 = new Boolean(false);
        Boolean b4 = new Boolean(true);
        Boolean b5 = new Boolean(true);
        System.out.println(b3.compareTo(b4));
        System.out.println(b5.compareTo(b4));

        System.out.println(b3 == b4);
        System.out.println(b5 == b4);//false ???

        //autobox and unbox
        Integer i7 = 9; //9 is int value -> autobox -> Integer object
        int i8 = i7; //9 i7 is Interger object -> unbox ->int value

        Integer i9 = new Integer(9);
        int i10 =i9.intValue();

        Integer i11 = Integer.valueOf(9);//static method,the result is same as "new Integer(9)"
        Integer i12 = Integer.parseInt("10");//將String轉做int，但只限數字
        int i13 = Integer.parseInt("123");
        System.out.println("valueof"+i11);
        System.out.println(i12);
        System.out.println(i13);
        
        System.out.println(new Byte("10"));
        System.out.println(new Byte((byte)10));

        Integer[] int11 = new Integer[5];//array寫法

        
    }
    
}
