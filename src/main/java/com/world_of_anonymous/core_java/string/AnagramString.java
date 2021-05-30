package com.world_of_anonymous.core_java.string;

import java.util.Arrays;

/**
 * Anagram :
 * - Character are same in both string
 * - Sequence is doesn't matter.
 * - Each character counted as 1 no matter it will be repetitive or not.
 * - Sort in small character before process.
 */
public class AnagramString {
    public static void main(String[] args) {
        String str1 = "Brag";
        String str2 = "Grab";

        if (str1.length() != str2.length()) {
            System.out.println("String is not anagram...!!!");
        } else {
            char[] chArr1 = str1.toLowerCase().toCharArray();
            char[] chArr2 = str2.toLowerCase().toCharArray();

            Arrays.sort(chArr1);
            Arrays.sort(chArr2);

            if (Arrays.equals(chArr1, chArr2)) {
                System.out.println("String is anagram...!!!");
            } else {
                System.out.println("String is anagram...!!!");
            }
        }
    }
}
