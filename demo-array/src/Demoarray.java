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


    }

}