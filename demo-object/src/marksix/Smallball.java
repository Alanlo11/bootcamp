package marksix;

import java.util.Objects;

public class Smallball extends Ball{
  private String color;
  private int number;

  public int getNumber(){
    return this.number;
  }

  public Smallball(String color,int number){
    super(number);
    this.color = color;
  }

  public Smallball(){

  }
  
  public void addColor(String color){
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }

  public String getSmallball(){
    return this.color + this.number;
  }

  @Override
  public String toString(){
    return "Color=" + this.color + " " + super.toString();
  }

  @Override
  public int hashCode(){
    return Objects.hash(super.getNumber(),this.color);
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj)
     return true;
    if(!(obj instanceof Smallball))
     return false;
    Smallball smallball = (Smallball) obj;
     return Objects.equals(this.color, smallball.color)
    && Objects.equals(this.getNumber(), smallball.getNumber());
    // && Objects.equals(super.getNumber(), smallball.getNumber()); 兩句都一樣，但係用super，因為繼承左
  }

public static void main(String[] args) {
  Smallball b1 = new Smallball("RED",1);
  Smallball b2 = new Smallball("ORANGE",2);
  Smallball b3 = new Smallball("ORANGE",2);
  System.out.println(b2.equals(b3));//true

  System.out.println(b2.hashCode());//-1955520979
  System.out.println(b3.hashCode());//-1955520979
  System.out.println(b1.hashCode());

  System.out.println(b1.toString());
}
}
