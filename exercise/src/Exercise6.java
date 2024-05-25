public class Exercise6 {
    public static void main(String[] args) {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence

    int n1 = 1;
    int n2 = 1;
    int n3 = 0;
    System.out.println(n1);
    System.out.println(n2);
    for (int i=2 ; i<15 ; i++){
      n3=n1+n2;
      n1=n2;
      n2=n3;
      System.out.println(n3);
    }
  }
}