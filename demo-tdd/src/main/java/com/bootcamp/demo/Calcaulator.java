package com.bootcamp.demo;

import java.util.List;

public class Calcaulator {
  private List<Integer> integers;

  public Calcaulator(){

  }

  public Calcaulator(List<Integer> integers){
    this.integers = integers;
  }

  public int caller(){
    return sum() + 1;
  }

// mapToInt() -> IntStream -> sum()
// mapToDouble()
// mapToLong()
public int sum(){
  if(this.integers.size() > 2)
  return this.integers.get(0);
  // mapToInt() -> IntStream -> sum()
  return this.integers.stream().mapToInt(e -> e.intValue()).sum();
  }

  public int sum2(){
    if(this.integers.size() > 2)
      return this.integers.get(0);
    if(this.integers.size() > 1)
      return -1;
    return this.integers.stream().mapToInt(e -> e.intValue()).sum();
    }
  
}