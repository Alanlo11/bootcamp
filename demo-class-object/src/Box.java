import java.util.Arrays;

public class Box {

  //static variable(belongs to class)
  private static String logo = "apple";

  private String name;

  private static String prefix = "apple";

  //instance variable
  private String[] strings;

  public Box(){
    this.strings = new String[0];
  }

  public String[] getStrings(){
    return this.strings;
  }

  public String toString(){
    return Arrays.toString(this.strings);
  }

  public void setString(int index,String s){
    this.strings[index] = s;
  }

  public void addString(String s){
    String [] x = new String [this.strings.length+1];
    for(int i=0 ; i<this.strings.length ; i++){
      x[i] = this.strings[i];
    }
    x[x.length-1] = s;
    this.strings = x;
  }
  
  //remove corresponding Strings
  //revise the arr lenght
  public void deleteString(String s){
    String [] x = new String[this.strings.length];
    int deleteNums = 0;
    int index = 0;
    for(int i=0 ; i<this.strings.length ; i++){
      x[i] = this.strings[i];
    }
    for(int j=0 ; j<x.length ; j++){
      if(x[j].equals(s))
      deleteNums++;
    }
    String [] y = new String[this.strings.length-deleteNums];
       for(int i=0 ; i<x.length ; i++){
        if(x[i].equals(s))
        continue;
       y[index] = x[i];
       index++;
       this.strings = y;
       }
  }

  public void setName(String name){
    this.name = Box.prefix.concat("-").concat(name);
  }

  public String getName(){
    return this.name;
  }

  public static void main(String[] args) {
    Box box = new Box();
    box.addString("hello");
    box.addString("hello");
    box.addString("1233");
    System.out.println(Arrays.toString(box.getStrings()));
    System.out.println("box=" + box);

    box.setString(1, "world");
    System.out.println(box);

    box.addString("13ee");
    System.out.println(box);
    box.deleteString("hello");
    box.deleteString("world");
    System.out.println("box:" + box);

    System.out.println(box.logo);//apple

    Box box2 = new Box();
    box2.setName("Alan");
    System.out.println(box2.getName());


  }
}
