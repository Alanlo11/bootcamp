public class StringBox {
  private String value;
  private Integer integer;

  public StringBox(String value){
    this.value = value;
  }

  public StringBox(){

  }

  public void setInteger(Integer value){
    // this.value = String.valueOf(value);
    this.integer = value;
  }

  public String getValue(){
    return this.value;
  }

  public Integer getInteger(){
    return this.value;
  }

  public void setValue(String value){
    this.value = value;
  }

  public static void main(String[] args) {
    StringBox box = new StringBox("abc");
    System.out.println(box.getValue());// abc

    StringBox box2 = new StringBox();

  }
}