import java.util.Arrays;

public class Demoarray {
    public static void main(String[] args) {
        //When you create an array object;you have yo define the lenght of it
        //arr只可以放同類
        int [] arr = new int[3]; //儲3個數字 int only,其他野都唔得
        //arr放index
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = -3;

        //compile-time exception
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0] = 100;
        System.out.println(arr[0]);
        //run-time excetion

        int [] arr2 = new int [] {10,20,-3};
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        String [] s1 = new String[] {"Hello","abc","ijk"};
        System.out.println(s1[0]);
        System.out.println(s1[1]);
        System.out.println(s1[2]);

        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(arr2));


        int [] arr3 = new int[] {9,-3,-100,90,66,-4};
        for(int i =0 ; i<arr3.length ; i++){
            System.out.println(arr3[i]);
        }


        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<arr3.length ; i++){
            if (arr3[i]>max ) {
                max = arr3[i];
            }
        }
        System.out.println("max="+max);

        int i1=0;
        int i2=1;
        for(int i=0 ; i<arr3.length ; i++){
            if (arr3[i1] < arr3[i2]) {
                i1=i2;
                i2=i2+1;
            }
        }
        System.out.println(arr3[i1]);

        
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<arr3.length ; i++) {
            if (arr3[i]<min){
                min = arr3[i];
            }
        }
        System.out.println("min="+min);


        //num of e
        //boolean if 'r' exists
        //String result to store "qreel"
        int e = 0;
        char[] arr4 = new char[] {'l','e','e','r','q'};
        for(int i=0 ; i<arr4.length ; i++){
            if (arr4[i] == 'e')
            e += 1;
        }
        System.out.println("i="+ e);


        boolean isrExist = false;
        for(int i=0 ; i<arr4.length ; i++){
        if(arr4[i] == 'r'){
            isrExist = true;
            break;
        }
    }
        System.out.println("="+isrExist);

        String s = "";
        for(int i=arr4.length -1 ; i>=0 ; i--){
            s += arr4[i];
        }
        System.out.println("s="+s);

        

        //given 2 char array,--> 1 String
        //4a.result "oakpabft"
        //4b.obkt.....
        char[] c1 = new char[]{'o','a','k','p'};
        char[] c2 = new char[]{'a','b','f','t'};
        
        String a1 = "";
        for(int i=0 ; i<c1.length ; i++){
            a1 += c1[i];
        }
        for (int i=0 ; i<c2.length ; i++){
            a1 +=c2[i];
        }
        System.out.println("4a="+a1);
        


        String a2 = "";
        int ii = c1.length > c2.length ? c1.length : c2.length;
        for(int i=0 ; i<ii ; i++){
            if (i%2==0) {
                a2 += c1[i];
            }else{
                a2 += c2[i];
            }
        }
        System.out.println("4b="+a2);
        
        // pt
        String a3 = "";
        for(int i=0 ; i<c1.length ; i++){
            if(i>0 && i%3 ==0)
                a3 += c1[i];
        }
        for(int j=0 ; j<c1.length ; j++){
        if(j>0 && j%3 ==0)
                a3 += c2[j];
        }
        System.out.println("a3="+ a3);


        //obkta
        char[] c3 = new char[]{'o','a','k','p','a','b'};
        char[] c4 = new char[]{'a','b','f','t'};
        String a4 = "";
        int ii3 = c3.length > c4.length ? c3.length : c4.length;
        for(int i=0 ; i<ii3 ; i++){
            if (i%2==0 && i<c3.length) {
                a4 += c3[i];
            }else if (i%2 !=0 && i<c4.length) {
                a4 += c4[i];
                }
            }
        
        System.out.println("4bb="+a4);


        char[] c5 = new char[]{'a','b','c','d','e','f','g','h'};
        char[] c6 = new char[]{'c','d','e'};
        char[] c7 = new char[]{'z','x','c','v','b','n','m','a','s','d'};
        String a5 = "";
        int i20 = 0;
        i20 = c5.length > c6.length ? c5.length : c6.length;
        i20 = i20 > c7.length ? i20 : c7.length;
        System.out.println("i20="+i20);


        //average
        int [] arr5 = new int [] {4,8,3};
        int sum2 =0 ;
        for(int i=0 ; i<arr5.length ; i++){
            sum2 += arr5[i];
        }
        sum2 = sum2/arr5.length;

        System.out.println(sum2);

        //swaping in array
        int [] arr6 = new int [] {6,10,-4,15};
        //swap -4,6 交換 -4,10,6,15
        int arr7 = arr6[0];
        arr6[0] = arr6[2];
        arr6[2] = arr7;
        System.out.println(Arrays.toString(arr6));

        //-4 10 6 15
        //move 6 to the tail of the arrays
        //10 6 15 -4
        int t = 0;
        for(int i=0 ; i<arr6.length -1 ; i++){
            t = arr6[i];
            arr6[i] = arr6[i+1];
            arr6[i+1] = t;
        }
        System.out.println(Arrays.toString(arr6));

        //lv2 move the max element to the tail
        //[6, 15, -4 , 10]
        //10,6,-4,15
        int tt = 0;
        for(int i=0 ; i<arr6.length -1 ; i++){
            if(arr6[i]>arr6[i+1]){
                tt=arr6[i];
                arr6[i] = arr6[i+1];
                arr6[i+1] = tt;
            }
            }
            System.out.println(Arrays.toString(arr6));
        
    

            //lv3
        //sorting 6,10,-4,15 -> -4,6,10,15
        int t3=0;
        for(int i=0 ; i<arr6.length-1 ; i++){
            for(int j=i+1 ; j<arr6.length-1 ; j++){
                if(arr6[i]>arr6[j]){
                    t3=arr6[i];
                    arr6[i]=arr6[j];
                    arr6[j]=t3;
                }
            }
        }
        System.out.println("lv3="+Arrays.toString(arr6));


        //swap char value
        String str = "hello"; //swap e and o -> holle
        char t2 =' ';
        //for(int i=0 ; i<s10.length()-1 ; i++){
        //    arr7[i] = s10.charAt(i);
       // }
        //Alternative
        char[] arr8 = str.toCharArray();

        t2 = arr8[1];
        arr8[1] = arr8[4];
        arr8[4]=t2;
        str = String.valueOf(arr8);//assign a new String value to varible s
        System.out.println(str);
    }

}