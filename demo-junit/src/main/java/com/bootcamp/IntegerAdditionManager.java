package com.bootcamp;

public class IntegerAdditionManager extends IntegerOperationManager{
  
  @Override
  public int operate(){
    int total = 0;
    for(Integer integer : super.getIntegers()){
      total += integer;
    }
    // return total; // day 1
    return total * 2; // day 2 change
  }

  
}
