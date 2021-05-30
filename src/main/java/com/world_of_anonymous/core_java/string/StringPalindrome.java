package com.world_of_anonymous.core_java.string;

import javax.xml.stream.events.Characters;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "Kayak";
        StringBuilder sb = new StringBuilder(str);
        if (str.toLowerCase().equals(sb.reverse().toString().toLowerCase())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        boolean flag=false;
        int len = str.length();
        for (int i=0; i<len/2; i++) {
            if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(len - 1 - i)) {
                flag=true;
            }
        }
        if (flag) {
            System.out.println("Not Palindrome");
        } else {
            System.out.println("Palindrome");
        }
    }
}
