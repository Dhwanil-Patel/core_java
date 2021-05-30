package com.world_of_anonymous.core_java.journaldev;

public class Factorial {
  public static void main(String[] args) {
    System.out.println(factorialRecursive(6));
  }

  public static int factorialRecursive(int val) {
    if (val == 1) {
      return 1;
    } else {
      return val * factorialRecursive(val-1);
    }
  }
}
