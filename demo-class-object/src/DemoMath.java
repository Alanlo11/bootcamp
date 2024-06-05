public class DemoMath {
  public static void main(String[] args) {
    //abs()正數
    int x = -3;
    int y = 8;
    int result = Math.abs(x * y);//int * int =int
    System.out.println(result);

    double d = 3.3d;
    double result2 = Math.abs(d * x);
    System.out.println(result2);

    long l = 10L;
    long result3 = Math.abs(l * x);
    System.out.println(result3);

    //max
    System.out.println(Math.max(10,9));
    System.out.println(Math.max(-10,9));

    //min
    System.out.println(Math.min(10,9));
    System.out.println(Math.min(-10,9));

    int[] arr = new int[]{4,-3,10,2};
    int max = Integer.MIN_VALUE;
    for (int i=0 ; i<arr.length ; i++){
      max = Math.max(max,arr[i]);
    }
    System.out.println(max);


    //round() -->最近的整數
    double d1 = 3.65d;
    System.out.println(Math.round(d1));//4
    System.out.println(Math.round(3.4));//3
    System.out.println(Math.round(3.5));//4
    System.out.println(Math.round(3.45));//3
    System.out.println(Math.round(3.44));//3

    //pow  return double
    //幾多次方 
    //因為dou點都會出整數
    double r4 = Math.pow(2, 3);
    System.out.println(r4);//8.0
    System.out.println(Math.pow(2.2, 3));//10.6480000

    //sqrt 開方
    System.out.println(Math.sqrt(25));
    System.out.println(Math.sqrt(24));
    System.out.println(Math.sqrt(-25));//NaN 不能解決的數


    //random()
    System.out.println(Math.random());//0.0 and 1.0
    System.out.println(Math.round(Math.random()*100));


  }
  
}
