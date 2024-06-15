import java.math.BigDecimal;
import java.util.Arrays;

public class Ex {

    public static int[] shuffle(int[] nums, int n) {
        int [] x = new int [n];
        int [] y = new int [n];
        int index = 0;
        int [] result = new int [nums.length];
        for(int i=0 ; i<n ; i++){
            x[i] = nums[i];
        }
        for(int j=n ; j<nums.length ; j++){
            y[index] = nums[j];
            index++;
        }
        index = 0;
        for(int i=0 ; i<n ; i++){
            result[index] = x[i];
            index++;
            result[index] = y[i];
        }
        return result;
    }

    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("0.1");
        BigDecimal num2 = new BigDecimal("0.2");

        System.out.println(num2.compareTo(num1));
        
        int [] q = new int [] {};
        String w = "erfd";
        w.length();

        
        
    }

    
   }