package sorting;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
  public static void main(String[] args) {
    Queue<String> pq = new PriorityQueue<>();
    //每次add()都會做sorting
    pq.add("def");// sorting [def]
    pq.add("abc");// sorting [def, abc] -> [abc, def]
    pq.add("bbb");// sorting [abc, def] - > [abc, bbb, def]
    pq.add("aax");// add唔一定能夠完成sorting，一定要用poll()先得
    System.out.println(pq);// [aax, abc, bbb, def], so add() method does not perform sorting...

    // while
    while (!pq.isEmpty()) {
      System.out.println(pq.poll());// complete sorting when you call poll() method...
      // 用poll先會真正做sorting,natural order 1-10 / a-z
    }
    // aax, abc, bbb, def
    // poll() -> 唔會影響入面個sorting,只係會拎下一個element出黎,同時delete

    // PriorityQueue.class add() & poll() differs to LinkedList.class (implemention)
    List<String> pq2 = new LinkedList<>();
    pq2.add("def");
    pq2.add("abc");
    pq2.add("bbb");
    pq2.add("aax");
    System.out.println(pq2);//[def, abc, bbb, aax]
    Collections.sort(pq2);
    System.out.println(pq2);//[aax, abc, bbb, def]
    // 1. Java 8 -> Stream
    // 2. Convert to Array -> Array.sort()

    Queue<Integer> pq3 = new PriorityQueue<>();
    pq3.add(-23);
    pq3.add(10000);
    pq3.add(10);
    pq3.add(-200);
    // poll() -> ordering
    System.out.println(pq3.poll());// -200
    pq3.add(-400);
    System.out.println(pq3.poll());// -400
    System.out.println(pq3.poll());// -23
    System.out.println(pq3.poll());// 10
    System.out.println(pq3.poll());// 10000

    Queue<Ball> pq4 = new PriorityQueue<>(new BallSortByNumber());
    pq4.add(new Ball(1,Color.BLACK));
    pq4.add(new Ball(10,Color.WHITE));
    pq4.add(new Ball(30,Color.BLACK));
    pq4.add(new Ball(15,Color.BLACK));
    pq4.add(new Ball(12,Color.RED));
    System.out.println(pq4.poll());
    System.out.println(pq4.poll());
    System.out.println(pq4.poll());
    System.out.println(pq4.poll());
    System.out.println(pq4.poll());
    
    Collections.sort(pq2, new StringSortByFirstCharacter());
    System.out.println(pq2);

    Queue<Customer> pq5 = new PriorityQueue<>(CustomerSortByAge.of());
    pq5.add(new Customer(15));
    pq5.add(new Customer(10));
    pq5.add(new Customer(12));
    pq5.add(new Customer(13));
    pq5.add(new Customer(20));
    System.out.println(pq5.poll());
    System.out.println(pq5.poll());
    System.out.println(pq5.poll());
    System.out.println(pq5.poll());

  }
}