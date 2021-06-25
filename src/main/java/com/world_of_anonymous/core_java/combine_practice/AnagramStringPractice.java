package com.world_of_anonymous.core_java.combine_practice;

import java.util.Arrays;

/**
 * Anagram : Means two string are equal if size is equal and position different and one character match only one in second.
 */
public class AnagramStringPractice {
    public static void main(String[] args) {
        System.out.println(isAnagram("Keep", "Peek"));
        System.out.println(isAnagram("Mother In Law", "Hitler Woman"));
    }

    private static boolean isAnagram(String first, String second) {
        String str1 = first.replace("\\s", "");
        String str2 = second.replace("\\s", "");

        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] chArr1 = str1.toLowerCase().toCharArray();
            char[] chArr2 = str2.toLowerCase().toCharArray();
            Arrays.sort(chArr1);
            Arrays.sort(chArr2);
            boolean equals = Arrays.equals(chArr1, chArr2);
            return equals;
        }
    }
}
