package com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;


// This is "Per Class" testing environment
// It will use one object to call all test methods.
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // method ordering
@TestMethodOrder(OrderAnnotation.class)
public class SolutionTestPerClassTest {
  private int x;

  @BeforeAll
  static void init(){
    System.out.println("Before All");
  }

  @AfterAll
  static void close(){
    System.out.println("After All");
  }

  @BeforeEach
  void beforeEach(){
    System.out.println("Before each..");
  }

  @AfterEach
  void afterEach(){
    System.out.println("After each..");
  }
  
  @Test
  @Order(2)
   void test(){
    this.x++;
    assertEquals(2, this.x);
  }

  @Test
  @Order(1)
  void test2(){
    this.x++;
    assertEquals(1, this.x);
  }


  // For Reference only, 背後做緊既野
   public static void main(String[] args) {
    SolutionTestPerClassTest.init();
    SolutionTestPerClassTest st1 = new SolutionTestPerClassTest();
    st1.test();
    st1.test2();
    SolutionTestPerClassTest.close();
   }
}
