package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

// Objective: Learn existing interface
public class Ball implements Comparable<Ball>{
  private int number;
  private Color color;

  public Ball(int number,Color color){
    this.number = number;
    this.color = color;
  }
  public int getNumber(){
    return this.number;
  }

  public Color getColor(){
    return this.color;
  }

  // Objectives: provide a formula to sort the List<Ball>
  // Return value: 1 or -1

  // -1 = left, 1 = right
  //Example 1: sort by number (descending)
  // You have 2 Ball object reference here: ball and this
  // -1 means "move to left" sort first (form left to right)
  // return  this.number > ball.getNumber() ? -1 : 1;
  // this.number > ball.getNumber() ? -1 : 1;
  @Override
  public int compareTo(Ball ball){
    // if(this.color == Color.RED)
    // return this.number > ball.number && this.color == Color.RED ? 1 : -1;
    // return this.color == Color.RED ? -1 : 1;
    if(this.color == Color.RED && ball.color != Color.RED)
    return -1;
    if(this.color != Color.RED && ball.color == Color.RED)
    return 1;
    if(this.color == Color.WHITE && ball.color == Color.BLACK)
    return -1;
    if(this.color == Color.BLACK && ball.color != Color.BLACK)
    return 1;
    return this.number > ball.number ? -1 : 1;
    // 同if一樣，-1 = false,1 = true
    // if(ball != null && this.number > ball.getNumber())
    // return -1;
    // return 1;
  }

  @Override
  public String toString(){
    return  this.color + ":" + this.number;
  }

  public static void main(String[] args) {
    
    List <Ball> balls = new ArrayList<>();
      balls.add(new Ball(10,Color.BLACK));
      balls.add(new Ball(14,Color.WHITE));
      balls.add(new Ball(8,Color.RED));
      balls.add(new Ball(7,Color.RED));
      balls.add(new Ball(6,Color.BLACK));
      balls.add(new Ball(1,Color.BLACK));
      balls.add(new Ball(3,Color.RED));
      balls.add(new Ball(15,Color.WHITE));
      balls.add(new Ball(20,Color.BLACK));
      balls.add(new Ball(12,Color.RED));
      balls.add(new Ball(4,Color.WHITE));

  System.out.println(balls);
  // [Number: 10 Color:BLACK, Number: 12 Color:WHITE, Number: 8 Color:RED]

  // Sort
  // Collections.sort() -> call for Loop List<Ball> -> ball.compareTo()
  // During compile time, java

  // Approach 1
  Collections.sort(balls);// 0(n log n) -> merge sort
  System.out.println("Collections Sort: " + balls);
  // [Ball(number=14, color=WHITE), Ball(number=10, color=BLACK),
  // Ball(number=8, color=RED)]

  // List<Bird> birds = new ArrayList<>();
  // Collections.sort(birds); //error, Bird.class did not implements Comparable

  // Sort by color?
  // Sort by color first, and then sort by Color
  // RED -> WHITE -> BLACK, if same Color, larger number go left

  // Approach 2
  balls.add(new Ball(1009, Color.RED));
  balls.add(new Ball(-8, Color.BLACK));

    int x = 3;
    Comparator<Ball> formula = null;
    if (x >= 3) {
      formula = new BallSortByColor();
    } else {
      Collections.sort(balls);
      // formula = new BallSortByNumber();
    }

  Collections.sort(balls, formula);
  System.out.println(balls);

  // Approach 2
  Collections.sort(balls, new BallSortByColor());
  System.out.println(balls);

  Collections.sort(balls,new BallSortByColorNumber());
  System.out.println(balls);

        

  }
}