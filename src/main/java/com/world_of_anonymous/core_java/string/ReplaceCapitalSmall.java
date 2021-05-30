package com.world_of_anonymous.core_java.string;

public class ReplaceCapitalSmall {
    public static void main(String[] args) {
        String str = "Great Power";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                sb.append(Character.toLowerCase(str.charAt(i)));
            } else if (Character.isLowerCase(str.charAt(i))) {
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
