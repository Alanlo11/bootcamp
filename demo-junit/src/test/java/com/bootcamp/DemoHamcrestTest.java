package com.bootcamp;

import java.util.List;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;


// !!! assertThat
public class DemoHamcrestTest {

  @Test
  void test(){
    assertThat(App.sum(1, 2), is(equalTo(3)));
    assertThat(App.subtract(1, 2), is(equalTo(-1)));
    assertThat(App.subtract(1, 2), is(not(equalTo(-2))));
    String s = null;
    assertThat(s, is(nullValue()));
    s = "abc";
    assertThat(s, is(not(nullValue())));
    String s2 = s;
    assertThat(s, is(sameInstance(s2)));
    String s3 = "abc";
    assertThat(s, is(sameInstance(s3))); // Literal Pool

    // Comparsion
    // int value = 42;
    // allOf() 0> all conditions pass
    assertThat(App.sum(40, 2), allOf(
      is(greaterThan(41)),
      greaterThanOrEqualTo(42),
      lessThan(43),
      lessThanOrEqualTo(42),
      equalTo(42)
    ));

    // String
    assertThat("hello", containsString("ll"));
    assertThat("hello", not(containsString("lll")));
    assertThat("hello", endsWith("lo"));
    assertThat("hello", startsWith("h"));
    assertThat("", is(emptyString()));
  }


  // 重要，因為成日用
  @Test
  void testList(){
    List<String> strings = List.of("abc","ijk","xyz");
    assertThat(strings, hasSize(3));
    // !!! contains() -> contains all with order
    assertThat(strings, contains("abc","ijk","xyz"));
    // !!! containsInAnyOrder() -> contains all without ordering
    assertThat(strings, containsInAnyOrder("abc","xyz","ijk"));
    assertThat(strings, not(containsInAnyOrder("abc","xyz")));
    // !!! hasItems
    assertThat(strings, hasItem("xyz"));
    assertThat(strings, hasItems("ijk"));
    // !!! isEmpty
    assertThat(strings, is(not(empty())));
  }

  @Test
  void testArray(){
    String[] arr = new String[]{"apple","banana","orange"};
    assertThat(arr, arrayContaining("apple","banana","orange"));
    assertThat(arr, not(arrayContaining("apple","orange")));
    assertThat(arr, arrayContainingInAnyOrder("apple", "orange", "banana"));
    assertThat(arr, not(arrayContainingInAnyOrder("apple", "orange")));
    assertThat(arr, arrayWithSize(3));
  }

  @Test
  void TestPolymorphism(){
    Number number = Long.valueOf(3);
    assertThat(number, is(instanceOf(Long.class)));
    assertThat(number, is(instanceOf(Number.class)));
    assertThat(number, is(instanceOf(Object.class)));
    assertThat(Cat.class, typeCompatibleWith(Animal.class));
    assertThat(Dog.class, typeCompatibleWith(Animal.class));
  }


  public static void main(String[] args) {
    // assertEquals(args, args);
    // assertNotEquals(args, args);
    // assertSame(args, args);
    // assertNotSame(args, args);
    // assertThrows(null, null);
    // etc

  }
}
