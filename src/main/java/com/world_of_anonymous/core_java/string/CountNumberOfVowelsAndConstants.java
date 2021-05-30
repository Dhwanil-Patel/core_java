package com.world_of_anonymous.core_java.string;

import java.util.Arrays;

public class CountNumberOfVowelsAndConstants {
    public static void main(String[] args) {
        int vowelCnt = 0, constantCnt=0;
        Character[] strArr = new Character[] {'a', 'e', 'i', 'o', 'u'};
        String str = "This is a really simple sentence";
        for (Character ch : str.replaceAll(" ", "").toCharArray()) {
            if (Arrays.asList(strArr).contains(ch)) {
                vowelCnt++;
            } else {
                constantCnt++;
            }
        }
        System.out.println("Vowel : "+vowelCnt+" Constant :"+constantCnt);
    }
}
