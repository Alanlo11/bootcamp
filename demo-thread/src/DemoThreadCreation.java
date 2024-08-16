public class DemoThreadCreation {
public static void main(String[] args) {
    // Single Thread
    Integer x = 1; // x is obj ref -> Integer Object
    x++;// 2
    System.out.println(x);//2
    ++x;// 3

    Task tast1 = new Task();
    Thread thread1 = new Thread(tast1);// main thread, thread1
    thread1.start();// run()

    // by default, main thread would proceed without waiting for thread1

    // but you can use join(), then both main thread and thread1 will wait each other
    try{
    thread1.join();// throw checked exception
    } catch (InterruptedException e){
        
    }
    
    System.out.println("Program End");
}
}