public class StringHelper {
private String str;
private int index;
private char ch;

public StringHelper(String str){
    this.str = str;
}

public StringHelper setCharAt(int index,char ch){
  String s = new String("");
  for(int i=0 ; i<this.str.length() ; i++){
    if(i == index)
    s += ch;
    else
    s += this.str.charAt(i);
  }
  this.str = s;
  return this;
}

public String toString(){
  return this.str;
}

public StringHelper append(String s){
  this.str += s;
  return this;
}

public int length(){
  return this.str.length();
}

public String substring(int startIdx,int endIdx){
  String x = "";
  for(int i=startIdx ; i<endIdx ; i++){
    x += this.str.charAt(i); 
  }
return x;
}

  public static void main(String[] args) {
    StringHelper sh = new StringHelper("hello");
    sh.setCharAt(3,'a');

    System.out.println(sh.toString());//helao

    sh.append("world");
    System.out.println(sh.toString());


    //chain method call
    sh.append("!!!").append(" I'm Alan.").setCharAt(10, '#').append("!!!!!");
    System.out.println(sh.toString());

    System.out.println(sh.substring(2, 5));//lao


  }
}
