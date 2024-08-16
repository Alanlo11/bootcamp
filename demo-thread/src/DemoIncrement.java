import java.util.concurrent.atomic.AtomicInteger;

public class DemoIncrement {
  private int x;// 0
  private int k;// 0

  // Solution 2 - AtomicInteger
  private AtomicInteger y = new AtomicInteger(0);
  private final Object lock = new Object();

  // Solution 1 -> synchronized method
  // instance method
  public synchronized void increment(){
    // 1000 Lines fo code....s
    // 成個method封晒
    this.x++;
  }

  public void increment2(){
    this.k++;// multi-thread may access variable k for read/write
    // Solution 3 - locked a code block
    synchronized(lock){// locked a code block
    this.x++;
    }
  }

  public static void main(String[] args) {
    DemoIncrement ball = new DemoIncrement();

    Runnable task = () -> {

      Thread threadInFo = Thread.currentThread();// call current thread
      System.out.println(threadInFo.getId());// 15, 14
      System.out.println(threadInFo.getName());// Thread-1, Thread-0

      for(int i=0 ; i<1_000_000 ; i++){
      ball.x++; // by default, x++ support multi thread
      }
    };

    Thread thread1 = new Thread(task);
    Thread thread2 = new Thread(task);

    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
    } catch (InterruptedException e){

    }
    System.out.println("x=" + ball.x);

    ball.x = 0;

    Runnable task2 = () -> {
      for(int i=0 ; i<1_000_000 ; i++){
        ball.increment();
        }
    };

    Thread thread3 = new Thread(task2);
    Thread thread4 = new Thread(task2);
    thread3.start();
    thread4.start();
    try{
      thread3.join();
      thread4.join();
    } catch (InterruptedException e){

    }

    System.out.println("x=" + ball.x);// x=2,000,000

    ball.x = 0;
    
    Runnable task3 = () -> {
      for(int i=0 ; i<1_000_000 ; i++){
        ball.y.incrementAndGet();// sililar to y++, revise itself. Thread-safe.
        }
    };

    Thread thread5 = new Thread(task3);
    Thread thread6 = new Thread(task3);
    thread5.start();
    thread6.start();
    try{
      thread5.join();
      thread6.join();
    } catch (InterruptedException e){

    }
    System.out.println("x=" + ball.y.get());


    ball.x = 0;
    
    Runnable task4 = () -> {
      for(int i=0 ; i<1_000_000 ; i++){
        ball.increment2();// sililar to y++, revise itself. Thread-safe.
        }
    };

    Thread thread7 = new Thread(task4);
    Thread thread8 = new Thread(task4);
    thread7.start();
    thread8.start();
    try{
      thread7.join();
      thread8.join();
    } catch (InterruptedException e){

    }
    System.out.println(ball.k);
    System.out.println(ball.x);

    System.out.println("Program End");
  }
}