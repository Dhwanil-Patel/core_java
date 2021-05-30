package com.world_of_anonymous.core_java.journaldev;

public class SwapWithoutThirdVar {
  public static void main(String[] args) {
    int i = 10;
    int j = 20;
    i = i + j;
    j = i - j;
    i = i - j;
    System.out.println("i : "+ i + " j: "+j);
  }
}
