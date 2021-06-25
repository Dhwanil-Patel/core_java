package com.world_of_anonymous.core_java.combine_practice;

public class Polymorphism {
  public static void main(String[] args) {
    A a = new B();
    ((B) a).msg1();
  }
}

class A {

  public A() {
    System.out.println("Parent Class loaded!!!");
  }

  public void msg() {
    System.out.println("Parent Class loaded!!!");
  }
}

class B extends A {

  public B() {
    super();
    System.out.println("Child Class loaded!!!");
  }

  public void msg() {
    System.out.println("Child Class loaded!!!");
  }

  public void msg1() {
    System.out.println("Child Class second method loaded!!!");
  }
}
