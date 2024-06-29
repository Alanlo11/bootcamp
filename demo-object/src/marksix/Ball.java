package marksix;

import java.util.Arrays;
import java.util.Objects;

public class Ball {
  private int number;

  public int getNumber(){
    return this.number;
  }

  public Ball(){

  }

  public Ball(int number){
    this.number = number;
  }

  @Override
  public String toString(){
    return "Number="+this.number;
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj)
      return true;
    if(!(obj instanceof Ball))
      return false;
    Ball ball = (Ball) obj;
      return Objects.equals(this.number,ball.getNumber());
  }

  public static void main(String[] args) {
    byte b1 = 48;//java (special conversion:int -> byte,but without casting in downcast)

    int i1 = 48;
    byte b2 = (byte)i1;//the type i1 is int,so we have to explicitly covert the value

    int[] arr = new int[3];
    System.out.println(Arrays.toString(arr));
    int[] arr2 = new int[3];
    System.out.println(Arrays.toString(arr2));
    System.out.println(arr.equals(arr2));//false
    System.out.println(Arrays.equals(arr, arr2));//ture,呢個係用黎chk地址

    Object ball = new Ball(48);
    //ball.getNumber();  Polymorhism
    System.out.println(ball.getClass());//class marksix.Ball

    Class<?> clazz = ball.getClass();//呢一刻唔知係咩class，所以只可以打？
    System.out.println(clazz);

    System.out.println(ball instanceof Ball);//true
  }
  
}