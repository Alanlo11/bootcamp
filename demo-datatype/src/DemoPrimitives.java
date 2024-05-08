public class DemoPrimitives{
    //public class (filenname)要一樣,大細階都要
    public static void main(String[] args){
        // numbers /strings(text)
        // number (integers整數/decimal)
        //int is a data type that declaring the type of value of x can be stored
         //int y = 3.5;INT係整數
        int x = 4;
        int z = 2;
        int a = 6;
        int b = 3;
        int total = a + b * x - z * a;
        System.out.println(total);

        // +-*/
        int c = total - 10 + x;
        System.out.println(c);

        int k =a+x*8;
        System.out.println(k);

    //remainder

    int remainder = 10 % 3;
    int divide = 10/3;
    System.out.println(remainder); //1
    System.out.println(divide); //3
    }
}