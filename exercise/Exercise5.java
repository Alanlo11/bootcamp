package exercise;

public class Exercise5 {
    public static void main(String[] args) {
          /**
           * 
           * When target = 'c', the expected output:
           * We found 3 character c in the String.
           * 
           * When target = 'z', the expected output:
           * Not Found.
           */
          // Count the target of character in a String.
            String str = "Welcome to the coding bootcamp."; // You should not change this line
            char target = 'z'; // Update this target to test the logic
        
            // Use a loop to count the target of character in a String.
            // code here ...
            int i=0;
            int j = 0;
        for(i=0 ; i< str.length() ; i++) {
            if(str.charAt(i) != target)
            {continue;}
            j += 1;}
            if(j>0)
            System.out.println("We found "+j+" character c in the String");
            else
            System.out.println("Not Found");
            // if found, print "We found 3 character c in the String."
            // if not found, print "Not Found."
            // code here ...
        
          }
        }