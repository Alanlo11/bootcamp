import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoHashtable {
  public static void main(String[] args) {
    // Hashtable VS HashMap
    // HashMap (non thread-safe, better performance) VS Hashtable (thread-safe, poor performance -> synchronized)
    Hashtable<String, String> table = new Hashtable<>();

    Runnable stringtotable1 = () -> {
      for(int i=0 ; i<100_000 ; i++){
        table.put(String.valueOf(i), "hello");
      }
    };

    Runnable stringtotable2 = () -> {
      for(int i=100_000 ; i<200_000 ; i++){
        table.put(String.valueOf(i), "hello");
      }
    };

    long startTime = System.currentTimeMillis();
    Thread thread1 = new Thread(stringtotable1);
    Thread thread2 = new Thread(stringtotable2);
    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("Table Time:" + (afterTime - startTime));// 226ms
      System.out.println("Table.size=" + table.size());// 
    } catch (InterruptedException e){

    }

    System.out.println("Program End");

    Map<String, String> map = new HashMap<>();

    Runnable stringtomap1 = () -> {
      for(int i=0 ; i<100_000 ; i++){
        map.put(String.valueOf(i), "hello");
      }
    };

    Runnable stringtomap2 = () -> {
      for(int i=100_000 ; i<200_000; i++){
        map.put(String.valueOf(i), "hello");
      }
    };

    startTime = System.currentTimeMillis();
    Thread thread3 = new Thread(stringtomap1);
    Thread thread4 = new Thread(stringtomap2);
    thread3.start();
    thread4.start();

    try{
      thread3.join();
      thread4.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("Map Time:" + (afterTime - startTime));// 156ms
      System.out.println("Map.size=" + map.size());
    } catch (InterruptedException e){

    }

    System.out.println("Program End");

    // null key & null value
    HashMap<Integer, String> map2 = new HashMap<>();
    map2.put(null, "abc");
    map2.put(null, "def");// replace entry
    map2.put(3, null);
    System.out.println(map2.size());// 2

    Hashtable<Integer, String> table2 = new Hashtable<>();
    // table2.put(null, "abc");// Hashtable -> key cannot be null, otherwise java.lang.NullPointerException
    // table2.put(3, null);// java.lang.NullPointerException
    table2.put(1, "abc");
    table2.put(1, "def");
    System.out.println(table2.get(1));// def
    System.out.println(table2.size());// 1
  }
}
