package com.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import com.bootcamp.Calculator.Calculator;

// Test Instance -> Per Method
@ExtendWith(MockitoExtension.class)
public class IntegerPocketTest {
  
  // !!! inject a fake object (all instance WITHOUT actual implementations)
  @Mock
  private IntegerOperationManager operationManager;

  // !!! Look for a constructor to create  IntegerPocket Object
  // !!! "public IntegerPocket(IntegerOperationManager operationManager)"
  // !!! Look for IntegerOperationManager Object
  // !!! You have mocked the IntegerOperationManager object
  // !!! Finally created this integerPocket object
  @InjectMocks
  private IntegerPocket integerPocket;

  // !!! inject a real object (all instance WITH actual implementations)
  @Spy
  private Calculator calculator;

  // !!! Why do we need @Mock?
  // !!! IntegerPocket's sum() call operationManger's sum()
  @Test
  void testSum1(){
    // Assumption
    Mockito.when(operationManager.operate()).thenReturn(11); 
    // !!! Test Scenario of "result > 10"
    // Test IntegerPocket sum()
    // IntegerPocket integerPocket = new IntegerPocket(this.operationManager);
    this.integerPocket.add(3);
    this.integerPocket.add(10);
    this.integerPocket.add(2);
    int result = this.integerPocket.sum();
    assertEquals(14, result);

    // !!! Verify if the process of "integerPocket.sum()" was calling operationManager.operate() // after @InjectMocks
    // Test試左幾多次用呢個Method
    verify(this.operationManager,times(1)).operate();
  }

  @Test
  void testSum2(){
    // Assumption
    Mockito.when(this.operationManager.operate()).thenReturn(10);
    // !!! Test Scenario of "result <= 10"
    // Test IntegerPocket sum()
    // IntegerPocket integerPocket = new IntegerPocket(this.operationManager);
    int result = this.integerPocket.sum();
    assertEquals(7, result);
    verify(this.operationManager,times(1)).operate();
  }

  @Test
  void testCalculator(){
    Mockito.when(this.calculator.sum(3,2)).thenReturn(20); // !!! override sum() Method
    int result = this.integerPocket.compute(3, 2);
    assertEquals(24, result); // 20 + (3 - 2) +3
  }

  @Test
  void testCalculator2(){
    Mockito.when(this.calculator.substract(3,2)).thenReturn(50); // !!! override substract() Method
    int result = this.integerPocket.compute(3, 2);
    assertEquals(58, result); // (3 + 2) + 50 + 3
  }

  @Test
  void testCalculator3(){
    Mockito.when(this.calculator.sum(3,2)).thenReturn(99);
    Mockito.when(this.calculator.substract(3,2)).thenReturn(1);
    int result = this.integerPocket.compute(3, 2);
    assertEquals(103, result); // 99 + 1 + 3
  }

}