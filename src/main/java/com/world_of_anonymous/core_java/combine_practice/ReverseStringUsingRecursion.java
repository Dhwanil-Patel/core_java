package com.world_of_anonymous.core_java.combine_practice;

public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        System.out.println(reverseStr("Dhwanil"));
    }

    private static String reverseStr(String str) {
        if (str.length() == 1) {
            return str;
        }
        return reverseStr(str.substring(0, str.length()-1));
    }
}
