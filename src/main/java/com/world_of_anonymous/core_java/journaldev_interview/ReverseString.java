package com.world_of_anonymous.core_java.journaldev_interview;

public class ReverseString {
  public static void main(String[] args) {
    String str = "This is my first program.";
//    System.out.println(new StringBuilder(str).reverse());
    System.out.println(reverse(str));
  }

  public static String reverse(String str) {
    String res = "";
    if (str.isEmpty() || str == null) {
      throw new IllegalArgumentException("Invalid input!!!");
    }
    for (int i=str.length(); i>0; i--) {
      res.concat(String.valueOf(str.charAt(i-1)));
    }
    return res;
  }
}
