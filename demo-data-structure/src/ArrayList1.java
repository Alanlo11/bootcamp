import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
  private Integer[] integers;

  public ArrayList1(){
    this.integers = new Integer[0];
  }

  public void add(Integer in){
    Integer[] temp = new Integer[this.integers.length + 1];
    // for(int i=0 ; i<this.integers.length ; i++){
    //   temp[i] = this.integers[i];
    //   if(i == this.integers.length){
    //     temp[this.integers.length + 1] = in;
    //   }
    // }
    // this.integers = temp;
    int idx = 0;
    for(Integer x : this.integers){
      temp[idx++] = x;
    }
    temp[idx] = in;
    this.integers = temp;
  }

  public Integer[] gIntegers(){
    return this.integers;
  }

  @Override
  public String toString(){
    return Arrays.toString(this.integers);
  }

  public int size(){
    return this.integers.length;
  }

  public void remove(Integer index){
    Integer[] temp = new Integer[this.integers.length -1];
    int idx = 0;
    for(int i=0 ; i<this.integers.length ; i++){
      if(i != index){
        temp[idx++] = this.integers[i];
      }
    }
    this.integers = temp;
  }

  public boolean isEmpty(){
    return this.size() == 0;
  }

  public static void main(String[] args) {
    ArrayList1 list = new ArrayList1();
    list.add(10);
    list.add(2);
    list.add(-4);
    for(Integer x : list.gIntegers()){
      System.out.println(x);
    }

    System.out.println(list);//[10, 2, -4]

    list.add(100);
    System.out.println(list);//[10, 2, -4, 100]

    list.remove(2);
    System.out.println(list);

    ArrayList<String> strings = new ArrayList<>();
    //You can skip the type declaration when you create the arraylist object
    //by default it follow the type specified at the left hand side

    strings.add("hello");
    strings.add("abc");
    strings.add("world");
    strings.remove(1);//remove "abc" -> ["hello","world"]
    strings.add("hello");//["hello","world","hello"]
    strings.remove("hello");//remove the first "hello" object -> ["world","hello"]
    System.out.println(strings);//world
  
  }
}