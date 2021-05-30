package com.world_of_anonymous.core_java.journaldev;

import java.util.Random;

public class Test {
  public static void main(String[] args) {
    Random rm = new Random();
    for (int i=0; i<100; i++) {
      System.out.println((rm.nextInt(100)%10)+1);
    }
  }
}
