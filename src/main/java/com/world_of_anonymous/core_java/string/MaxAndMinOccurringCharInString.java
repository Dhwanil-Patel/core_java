package com.world_of_anonymous.core_java.string;

import java.util.*;
import java.util.stream.Collectors;

public class MaxAndMinOccurringCharInString {
    public static void main(String[] args) {
        int val = 0;
        String str = "grass is greener on the other side";
        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : str.toCharArray()) {
            if (map.keySet().contains(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }

        LinkedHashMap<Character, Integer> newMap = map.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(newMap);
    }
}
