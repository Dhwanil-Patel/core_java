package com.world_of_anonymous.core_java.string;

import java.util.ArrayList;
import java.util.List;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str1 = "Great responsibility";
        String str = str1.toLowerCase();
        List<Character> chars = new ArrayList<>();
        for (int i=0; i<str.toLowerCase().toCharArray().length; i++) {
            if (!chars.contains(str.charAt(i))) {
                for (int j=i+1; j<str.toCharArray().length; j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        chars.add(str.charAt(i));
                        break;
                    }
                }
            }
        }
        System.out.println(chars);
    }
}
