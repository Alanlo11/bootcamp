import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoVector {
  public static void main(String[] args) {
    // ArrayList (non thread-safe, better performance) VS Vector (thread-safe, poor performance -> synchronized)
    List<String> strings = new ArrayList<>();// ArrayList implementation differs to Vector implementation

    Runnable addStringToArrayList = () -> {
      for(int i=0 ; i<1_000_000 ; i++){
        strings.add("hello");
      }
    };// run() method implementation

    long startTime = System.currentTimeMillis();
    Thread thread1 = new Thread(addStringToArrayList);
    Thread thread2 = new Thread(addStringToArrayList);
    thread1.start();// call run()
    thread2.start();

    try{
      thread1.join();
      thread2.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("ArrayList runtime: " + (afterTime - startTime));// 5-20 ms
      System.out.println("ArrayList.Size: " + strings.size());// ArrayList.Size:1120141
  } catch (InterruptedException e ){

  }

    // System.out.println("Main:" + strings.size());// NOT OK, main program flow, 因為main會行先
    System.out.println("Program End");

  // Steps to resize the ArrayList/ Array (add element)
  // 1. create a new array (old length + 1)
  // 2. copy of the old array to new array
  // 3. Add the new element at the end of the array
  // 4. reassign the new object ref to the old obj ref

  List<String> strings2 = new Vector<>();// ArrayList implementation differs to Vector implementation

    Runnable addStringToVector = () -> {
      for(int i=0 ; i<1_000_000 ; i++){
        strings2.add("hello");
      }
    };// run() method implementation

    startTime = System.currentTimeMillis();
    Thread thread3 = new Thread(addStringToVector);
    Thread thread4 = new Thread(addStringToVector);
    thread3.start();// call run()
    thread4.start();

    try{
      thread3.join();
      thread4.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("VectorList runtime: " + (afterTime - startTime));// 40-60 ms
      System.out.println("Vector.Size: " + strings2.size());// Vector.Size:2000000
  } catch (InterruptedException e ){

  }

  }
}