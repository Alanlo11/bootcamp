package com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IntegerOperationManagerTest {
  
  @Test
  void testSum(){
    IntegerOperationManager manager = new IntegerAdditionManager();
    manager.add(3);
    manager.add(10);
    manager.add(2);
    // assertEquals(15, manager.sum()); // day 1 case
    assertEquals(30, manager.operate()); // day 2 case
  }

}
