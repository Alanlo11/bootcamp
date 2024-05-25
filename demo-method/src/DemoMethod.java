public class DemoMethod {
    public static void main(String[] args) {
        //method:you put something into the box,and then it return something to you
        //calling method
        System.out.println("hello");
        
        //call method (sum)
        int result = sum(10,3);
        System.out.println("result="+result);

        System.out.println(lastChar("hello"));

        System.out.println(toString(new char[]{'a','b','c'}));//abc

        System.out.println(max(new int[]{1,2,30,4,5}));

        System.out.println(isSubstring("hello","lll"));
   

    }
    

    public static int sum(int x, int y){
        //if your method is with return type,the method content should contain a key word"return"
        //自己設計
        //return type一定要符合返自己設定的要求.int String
        return x+y;//int + int = int
    }


    public static char lastChar(String s){
        return s.charAt(s.length()-1);
    }

    public static String toString(char[] arr){
        //approadch 1
        //String result = "";
        //for(int i=0 ; i<arr.length ; i++){
        //result += arr[i];    
        //}
        //return result;

        //apprpach 2
        return String.valueOf(arr);
    }

    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>max){
            max = arr[i];
            }
        }
        return max;
    }

    public static boolean isElderly(int age){
            //if (age>65) {
            //    return true;
            //}
            //return false;

        return age >65;
    }

    public static boolean isSubstring(String str,String substr){
        //chk if substr is a substring of str
        //approach 1
        //return str.contains(substr);

        //approach 2
        //index of method return an int index to,which is index of the substring
        //if it is return -1,means not exists
        //return str.indexOf(substr) != -1;

        //approach 3
        for(int i=0 ; i<str.length() ; i++){
            for(int j=0 ; i<str.length() - substr.length()+1 ; j++){
                if(str.charAt(i+j) != substr.charAt(j)){
                    break;
                }
                if (j == substr.length()-1)  {
                    return true;
                }else{
                    return false;
                }
            }
        }

    
    return false;
    }

    public static double circleArea(int radius){
        return radius*3.14;
    }
}
