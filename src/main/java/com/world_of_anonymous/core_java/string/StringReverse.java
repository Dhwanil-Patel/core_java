package com.world_of_anonymous.core_java.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Dream Big";
        String reverse = "";

        for (int i=(str.length()-1); i >= 0; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);

        System.out.println(new StringBuilder(str).reverse());
    }
}
