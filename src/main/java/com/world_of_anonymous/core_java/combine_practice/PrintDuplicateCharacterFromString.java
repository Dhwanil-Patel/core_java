package com.world_of_anonymous.core_java.combine_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateCharacterFromString {
    public static void main(String[] args) {
        String str = "Combination";

        int[] intArr = str.chars().toArray();
        Set<Character> charArr = new HashSet<>();
        for (int i=0; i<intArr.length-1; i++) {
            if (str.toLowerCase().substring(i+1).contains(String.valueOf(str.charAt(i)))) {
                charArr.add(str.charAt(i));
            }
        }
        System.out.println(charArr);

        // 1. Using distinct method in stream
        String str2 = str.chars().distinct().mapToObj(String::valueOf).collect(Collectors.joining());
        System.out.println(str2);

        // 2. Stream API with array list

        String collect = Arrays.asList(str.toLowerCase().split(""))
            .stream()
            .distinct()
            .collect(Collectors.joining());
        System.out.println(collect);

        // 3. Using set

        int[] ints = str.chars().toArray();
        Set<Character> characters = new HashSet<>();
        for (int i=0; i<ints.length; i++) {
            characters.add(str.charAt(i));
        }

        String str1 = characters.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(str1);
    }
}
