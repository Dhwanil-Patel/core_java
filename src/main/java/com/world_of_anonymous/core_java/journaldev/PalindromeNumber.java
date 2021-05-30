package com.world_of_anonymous.core_java.journaldev;

/**
 * Palindrome : Actual number and their reverse is same
 */
public class PalindromeNumber {
  public static void main(String[] args) {
    int num = 125;
//    if (isIntegerPalindrome(num) == num) {
    if (isStringPalindrome("abcdcba")) {
      System.out.println("Number is palindrome!!!");
    } else {
      System.out.println("Number is not palindrome!!!");
    }
  }

  public static int isIntegerPalindrome(int num) {
    int r = 0;
    int sum = 0;
    while (num > 0) {
      r = num % 10;
      sum = (sum * 10) + r;
      num = num / 10;
    }
    return sum;
  }

  public static boolean isStringPalindrome(String str) {
    int length = str.length();
    int isEquleSize = length % 2;
    int mid = (isEquleSize == 0) ? (length/2) - 1 : (length/2) - 1;
    for (int i=0; i<=mid; i++) {
//      System.out.println("i : "+str.charAt(i)+" len : "+str.charAt(length-1));
      if (str.charAt(i) != str.charAt(length-1)) {
        return false;
      }
      length-=1;
    }
    return true;
  }
}
