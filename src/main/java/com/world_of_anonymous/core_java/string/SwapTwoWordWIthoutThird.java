package com.world_of_anonymous.core_java.string;

public class SwapTwoWordWIthoutThird {
    public static void main(String[] args) {
        String str1 = "good";
        String str2 = "morning";

        str1 = str1.concat(str2);
        str2 = str1.replace(str2, "");
        str1 = str1.replace(str2, "");

        System.out.println(str1 +" "+ str2);
    }
}
