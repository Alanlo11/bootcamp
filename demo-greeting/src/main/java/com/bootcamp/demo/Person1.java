package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @Getter
// @Setter
// @ToString
// @EqualsAndHashCode
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // call all args constructor

public class Person1 {
  private String name;
  private int age;

  public static void main(String[] args) {
    Person1 p1 = new Person1(); // no args construction
    p1.setAge(100);
    p1.setName("John");
    System.out.println(p1.getAge());
    System.out.println(p1.getName());
    System.out.println(p1);// toString
    
    Person1 p2 = new Person1("Peter", 10);
    p2.setAge(60);
    System.out.println(p2);

    Person1 p3 = Person1.builder().age(13).name("John").build();

  }
}
