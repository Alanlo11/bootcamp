package com.bootcamp;


public class App {

   // !!! For testing, it doesn't care the result of subtract() and sum()
   // Unit Test
   public static int combine(int x, int y){
      if (x >= 10 && y >= 3)
      return subtract(x, y);
      return sum(x, y);
   }

   // Unit Test
   public static int sum(int x, int y){
    return x + y;
   }

   // Unit Test
   public static int subtract(int x, int y){
      return x - y;
   }

   public static int divide(int x, int y){
      return x / y;
   }

}
