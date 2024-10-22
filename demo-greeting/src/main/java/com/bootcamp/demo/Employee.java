package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// !!! Child Class should not use @Data, because we control the "callSuper" manually !!!

@Getter
@Setter
@ToString(callSuper = true) // by default callSuper = false,姐係唔會用埋parent class
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true) // extend 左要對所有資料就要打埋呢句
@AllArgsConstructor

public class Employee extends Person1{
  private int salary;

  public Employee(String name, int age, int salary){
    super(name,age);
    this.salary = salary;
  }

  public static void main(String[] args) {
    Employee employee = new Employee(10000);
    Employee employee2 = new Employee("John", 23, 20000);
    Employee employee3 = new Employee("Peter", 23, 20000);
    Employee employee4 = new Employee("Peter", 23, 20000);
    System.out.println(employee);
    System.out.println(employee2);
    System.out.println(employee2.equals(employee3));// false
    System.out.println(employee3.equals(employee4));// true
  }
}
