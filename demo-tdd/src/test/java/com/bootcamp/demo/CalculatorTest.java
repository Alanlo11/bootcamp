package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  // private Calcaulator calcaulator;
  
  // requirement change: if number of integer > 2, return the first element
  @Test
  void testSum(){
    // assertEquals(15,new Calcaulator(Arrays.asList(3,10,2)).sum());
    // assertEquals(99,new Calcaulator(Arrays.asList(-3,100,2)).sum());
    assertEquals(3,new Calcaulator(Arrays.asList(3,10,2)).sum());
    assertEquals(-3,new Calcaulator(Arrays.asList(-3,100,2)).sum());
    assertEquals(0,new Calcaulator(Arrays.asList(0,0)).sum());
  }

}