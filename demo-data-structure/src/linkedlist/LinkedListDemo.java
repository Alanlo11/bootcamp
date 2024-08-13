package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {
  public static void main(String[] args) {
    // Array vs ArrayList
    //1. Underlying structure of ArrayList is Array
    //2. Array -> fixed length -> a range of continous memory locations

    Cat cat = new Cat(Color.BLUE);
    //Heap
    //Step 1: Cat Object
    //Step 2: Eye Array Object
    //Step 3: Two Eye object
    //Step 4: 3 color objects(created when you execute the main method)

    cat.getEye();//Eye Array object
    cat.getLeftEye();//Cat object -> Eye Array object -> Eye object

    Eye[] eyes = cat.getEye();//backup the array object memory location
    Eye rightEye = eyes[1];//right Eye object address

    //What is the relationship between the memory location of cat, eyes, rightEye?
    //1. LeftEye vs RightEye -> 相鄰的address
    //2. Cat object vs Eye[] object
    //3. Cat object vs eye object

    String[] strings = new String[100000];

    //linklist 係一個扣一個，唔係狂kill同生object
    //arraylist 係狂生同kill object
    LinkedList<String> strings2 = new LinkedList<>();
    strings2.add("A");
    strings2.add("B");
    strings2.add("C");
    strings2.remove("B");
    strings2.remove(0);
    strings2.add("D");
    for(String s : strings2){
      System.out.println(s);
    }

    System.out.println(strings2.get(strings2.size() - 1));
    //arr[arr.length -1]

    System.out.println(strings2.isEmpty());// false
    System.out.println(strings2.size());//2


    // LinkedList vs ArrayList
    // 1. Underlying DS
    // 2. Method Difference (i.e. LinkedList addFirst(), removeFirst())

    LinkedList<String> ll = new LinkedList<>();

    ll.add("hello");
    ll.addFirst("abc");
    ll.add("def");
    for(String s : ll){
      System.out.println(s);// abc, hello, def
    }

    ll.removeFirst();
    for(String s : ll){
      System.out.println(s);//hello, def
    }

    System.out.println(ll.indexOf("hello"));//0, it is chking the first "hello"

    ll.add("hello");
    System.out.println(ll.lastIndexOf("hello"));//2, chking the last "hello"

    ll.add(3, "abc");
    for(String s : ll){
      System.out.println(s);//hello, abc
    }

    List<String> ll1 = new LinkedList<>();

    //Queue.class
    Queue<String> emails = new LinkedList<>();
    emails.add("john@gmail.com");
    emails.add("peter@gmail.com");
    System.out.println(emails.size()); // Collection.class
    String head = emails.poll(); // remove and return the first element in queue
    System.out.println(head); // john@gmail.com
    emails.add("sally@hotmail.com");
    emails.add("dicky@yahoo.com.hk");

    String lookup = emails.peek(); // return the first element in queue
    System.out.println(lookup); // peter@gmail.com

    emails.remove(new String("dicky@yahoo.com.hk"));
    // LinkedList.class remove(Oject) -> LinkedList For loop

    // remove
    System.out.println();
    // emails.remove(new String(emails.remove("dicky@yahoo.com.hk")));
    //LinkedList.calssremoe (Objects) -> LinkedList for loop
 
    // for-each
    for(String s : emails){
      System.out.println(s);
    }

    // Convert Queue<String> to List<String>
    List<String> strings4 = new ArrayList<>();
    while (!emails.isEmpty()) { // isEmpty()
      // System.out.println(emails.poll());
      strings4.add(emails.poll());
    }
    System.out.println(strings4);
    System.out.println(emails); // after while loop, all elements are removed.

    //clear()
    strings4.clear();//clear all the objects inside the ArrayList object
    strings4.add("abc");
    strings4 = null;//remove the ArratList object   指向null -> 所有野都冇晒
    // strings4.add("def");// run time NPE(null pointer execption)

    List<String> s1 = new ArrayList<>();
    List<String> s2 = new LinkedList<>();

    s1.add("a");
    s1.add("b");
    System.out.println(s1);

    s2.add("a");
    s2.add("b");
    System.out.println(s2);

    String s3 = "abc";
    System.out.println(s3.indexOf("d"));
    System.out.println();


  }
}