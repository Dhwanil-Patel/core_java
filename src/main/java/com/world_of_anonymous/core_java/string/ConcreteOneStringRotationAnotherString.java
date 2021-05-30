package com.world_of_anonymous.core_java.string;

/**
 * In simple word after concat same string two time find second string exist in this concat string or not.
 */
public class ConcreteOneStringRotationAnotherString {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "deabc";

        if (str1.length() != str2.length()) {
            System.out.println("Second string is not rotation of first string.");
        } else if (str1.concat(str1).contains(str2)) {
            System.out.println("Second string is in rotation of first string.");
        } else {
            System.out.println("Second string is not rotation of first string.");
        }
    }
}
