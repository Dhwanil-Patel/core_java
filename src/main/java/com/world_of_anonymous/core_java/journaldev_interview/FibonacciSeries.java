package com.world_of_anonymous.core_java.journaldev_interview;

/**
 * Fibonacci : n = n-1 + 1-2
 */
public class FibonacciSeries {
  public static void main(String[] args) {
//    fibonacci(10);
//    recursion(0, 1, 10);
    System.out.println(shortRecursion(10));
  }

  public static void fibonacci(int count) {
    int prev = 0;
    int curr = 0;
    int next = 1;
    System.out.print(curr + ", ");
    if (count > 0) {
      while (count > 0) {
        System.out.print(next + ", ");
        curr = prev;
        prev = next;
        next = curr + prev;
        count--;
      }
    }
  }

  public static void recursion(int prev, int curr, int count) {
    if (prev == 0) {
      System.out.print(prev + ", ");
    }

    if (count > 0) {
      int next = prev + curr;
      prev = curr;
      curr = next;
      System.out.print(next + ", ");
      recursion(prev, curr, count-1);
    }
  }

  public static int shortRecursion(int n) {
    if (n <= 1)
      return n;
    return shortRecursion(n - 1) + shortRecursion(n - 2);
  }
}
