package com.bootcamp;

import java.util.LinkedList;
import java.util.List;

public abstract class IntegerOperationManager {
  private List<Integer> integers;

  public IntegerOperationManager(){
    this.integers = new LinkedList<>();
  }

  public void add(int value){
    this.integers.add(value);
  }

  public List<Integer> getIntegers(){
    return this.integers;
  }

  public abstract int operate();

}
