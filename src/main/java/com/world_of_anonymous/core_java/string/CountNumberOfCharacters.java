package com.world_of_anonymous.core_java.string;

public class CountNumberOfCharacters {
    public static void main(String[] args) {
        String string = "The best of both worlds";
        int count = string.replace(" ", "").length();
        System.out.println("Number of characters : "+count);
    }
}
