package com.world_of_anonymous.core_java.journaldev;

public class StringContainVowelOrNot {
  public static void main(String[] args) {
    displayMessage(isContainVowel("Hello"));
    displayMessage(isContainVowel("TV"));
  }

  public static boolean isContainVowel(String str) {
    return (str.toLowerCase().matches(".*[aeiou].*")) ? Boolean.TRUE : Boolean.FALSE;
  }

  public static void displayMessage(Boolean flag) {
    if ((flag)) {
      System.out.println("It contain vowel");
    } else {
      System.out.println("It not contain vowel");
    }
  }
}
