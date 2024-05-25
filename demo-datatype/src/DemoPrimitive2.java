public class DemoPrimitive2 {
    public static void main(String[] args) {
        long l1 = 10;//10=int
        long l2 = 10L; //10L=>long value
        long l3 = 10l; //避免用細階l
        //Java:int ->long
        long l4 = 63; //assign int value 63 to long variable l4 (int -> long)
        //int i1 = 4L; //cannot assign long value to long value ,because long is a type higher than int

        //byte -> short -> int -> long -> float -> double
        //char -> int (ascii) char 升級係 int

        double d1 = 1.8;
        double d2 = 1.8d;
        double d3 = 10L;
        byte b1 = 10;//ok,why? 10 int value -> byte

        float f3 = (float)1.9d;//you can only explicotly assign a value that with a type higher than the data type
        //downcast (overflow/precision loss)
        
        short s1 = 130;
        byte b2 = (byte) s1; //java doesn't know s1 = 128,during compile time 因為佢只係知short byte
        //-128 -> overflow 等於凸左出黎既會再由尾行上去
        System.out.println("b2="+b2);
        

        byte b3 = 127;
        short s2 = b3; //no risk

       double d4 = 10.9d;
       int i2 = (int)d4;
       System.out.println(i2); //精度損失,小數點後會冇晒
       

       char c1 = 'a';//97 ascii code
       char c2 = 'A';//65
       if(c1==c2){ //false, 97==65 背後CHK既野
       if(c1>c2) //比較緊數字 
       System.out.println("c1>c2"+c2); //String + char = String
       System.out.println("c1>c2"+(int)c2); //String + int = String
       }
       
       int c1IntValue = c1;//ok char ->int (upcast)

       int charValue = 97;
       char c3 = (char)charValue;// char-> conversion
       System.out.println("c3="+c3);
       
       
       char c4 = '你';
       int i5 = c4;
       System.out.println("i5="+i5);

       char c6 = 'a' + 1;
       System.out.println(c6);//b

       char c5 = '0';
       int i6 = c5;
       System.out.println(i6);

       int x = 40300;
       System.out.println((char)x);

       short a = (byte) 128; //int -> byte -> short
       System.out.println(a); //-128 


       
       byte b5 = (byte)128;//byte 最大到127,所以要咁寫先可以繼續run
       short s3 = 128; //stored到既值較大,所以唔洗理
      
       byte b8 = 127;
       for(int i=0 ; i<10 ; i++){
        b8 ++;
        System.out.println("b8= "+b8);
       }

       short s4 = 130;
       byte b10 = (byte)s4;
       System.out.println(b10);

       

    }
}