public class DemoLoop {
    public static void main(String[] args) {
        int x = 3;
        x *=3;
        x *=3;
        x *=3;


        //for loop
        //index 由0開始(0,1,2,3)
        //initiallization (variable declaration & assignment) ; continue criteria ; incremental operation
        //Step 1:"int i = 0"
        //Step 2:Chk if  i < 4 ? Yes
        //Step 3:print hello
        //Step 4:i++ = i become 1
        //Step 5:Chk if i < 4 ? Yes
        //Step 6:print hello
        //Step 7:i = 2
        //Step 8:Chk if i < 4 ? yes
        //Step 9:hello
        //Step 10:i = 3
        //Step 11:chk if i < 4 ? yes
        //Step 12:hello
        //Step 13:i = 4 
        //Step 14:chk if i < 4 ? no STOP HERE!!!
        //Step 15:exit the loop
        for (int i =0 ; i < 4 ; i++){
            System.out.println("hello");
         }

        int y = 3;
        for (int i = 0 ; i <3 ; i++)
        {y *= 3;}
            System.out.println("y="+y);

         //2,4,6 ask
         for (int i=0 ; i<7  ; i++){
             if(i !=0 && i % 2 == 0) {
                System.out.println("i="+i);
             }
         }


         int sum = 0;
         for(int i = 0 ; i < 11 ; i++)
         sum += i;
         System.out.println("sum="+sum);


         //2+4+6+8
         // % 2 係搵雙數
         int sum2 = 0;
         for(int i =0 ; i < 9 ; i++)
         if(i !=0 && i%2 ==0)
         {sum2 +=i;}
         System.out.println("sum2="+sum2);

         //8.6.4.2
         for(int i = 9 ; i > 0 ; i--)
         {if(i%2 ==0)
         {System.out.println(i);}}

         //break
         for (int i =0 ;i<10;i++){
            if(i>7){
                break;
            }
            System.out.println(i);//main logic
         }
         //0
         //1
         //...
         //7

         int total = 0;
         for (int i =0; i<5 ; i++)
         {if(i>3)
            {continue;}//when i=4,skip "total +=i",go to "i++"
            total += i;}
         System.out.println("total="+ total);


         
    } 
}