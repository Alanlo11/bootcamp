package com.bootcamp;


// !!! "static import" is for static method call.
// !!! After "static import", you can call the static method by the method name directly.
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.Duration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


// !!!!!!! save before compile !!!!!!

public class AppTest {

    // After addimg dependency "junit-jupiter.params", you can use @ParameterizedTest & @CsvSource
    // 另一個方法寫test case

    @DisplayName("Test App.sum()")
    @ParameterizedTest
    @CsvSource({"3, 1, 2","0, 0, 0","-9, -11, 2"})
    void testSum(int expected, int x, int y){
        assertEquals(expected, App.sum(x, y));
    }

    @DisplayName("Test App.Subtract()")
    @Test
    void testSubtract(){
        // 呢個需要理個結果岩唔岩
        assertEquals(5, App.subtract(7, 2));
    }

    @Test
    void testCombine(){
        // 呢個只需要試條路岩唔岩，唔需要理個結果岩唔岩
        // Scenario 1: x >= 10 and y >= 3 -> subtract()
        assertEquals(7, App.combine(10,3));
        // Scenario 2: x < 10 and y >= 3 -> sum()
        assertEquals(12, App.combine(9,3));
        // Scenario 3: x >= 10 and y < 3 -> sum()
        assertEquals(12, App.combine(10,2));
        // Scenario 4: x < 10 and y < 3 -> sum()
        assertEquals(11, App.combine(9,2));

        assertEquals(8, App.combine(11,3)); // meaningless
        // !!! because this test case is testing the same thing with Scenario 1
    }

    @Test
    void testAssert(){
        String s1 = new String();
        String s2 = new String();
        String s3 = s2;
        assertNotSame(s1, s2);
        assertSame(s2, s3);

        String s4 = null;
        assertNull(s4);

        assertNotNull(s3);
    }

    @Test
    void testThrow(){
        assertThrows(ArithmeticException.class,() -> {
            App.divide(10, 0);
        });

        // !!!! Common
        assertDoesNotThrow ( () -> {
            App.divide(10,1);
        });
    }

    @Test
    void testArray(){
        int[] arr = new int[] {1,2,3};
        int[] arr2 = new int[] {1,2,3};
        assertArrayEquals(arr, arr2);

        int[] arr3 = new int[] {2,1,3};
        // assertArrayEquals (arr2, arr3);
    }

    @Test
    void testAssertAll(){
        assertAll( 
            () -> assertTrue(App.sum(3,2) == 5),
            () -> assertTrue(App.subtract(10,2) == 8),
            () -> assertEquals(8, App.subtract(10, 2))
        );
    }

    // Non-funcational Requirement
    @Test
    void testTimeout(){
        assertTimeout(Duration.ofMillis(100), () -> {
            // Normally, you write the logic here to test...
            App.sum(5, 6);
            Thread.sleep(90);
        });
    }

}
