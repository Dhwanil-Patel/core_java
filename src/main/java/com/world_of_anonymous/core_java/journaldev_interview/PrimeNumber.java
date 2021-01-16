package com.world_of_anonymous.core_java.journaldev_interview;

/**
 * Prime : Divide by 1 or own self.
 */
public class PrimeNumber {
  public static void main(String[] args) {
    if (isPrime(17)) {
      System.out.println("Number is prime!!!");
    } else {
      System.out.println("Number is not prime!!!");
    }
  }

  public static boolean isPrime(Integer num) {
    if (num==0) {
      return true;
    }
    if (num==1) {
      return false;
    }
    for (int i=2; i<num; i++) {
      if (num%i==0) {
        return false;
      }
    }
    return true;
  }
}
