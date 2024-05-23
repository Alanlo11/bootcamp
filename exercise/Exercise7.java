package exercise;

public class Exercise7 {
    public static void main(String[] args) {
        /**
         * The sum is 55
         */
          // Sum values of an array
            // Declare a int array, with value 1 to 10
            // code here
            int sum = 0;
            int[] a = new int [11];
            for(int i=0 ; i<a.length ; i++){
              a[i] = i;
            }
        
            // Write a loop to sum up all value in the int array
            // code here ...
            for(int i=0 ; i<a.length ; i++){
              sum += a[i];
            }
            System.out.println(sum);
          }
        }