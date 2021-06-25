package com.world_of_anonymous.core_java.combine_practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapValue {
  public static void main(String[] args) {
    Map<String, Integer> scores = new HashMap<>();

    scores.put("David", 95);
    scores.put("Jane", 80);
    scores.put("Mary", 97);
    scores.put("Lisa", 78);
    scores.put("Dino", 65);

    System.out.println(scores);

    scores = scores.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
            (oldValue, newValue) -> oldValue, LinkedHashMap::new));

    System.out.println(scores);
  }
}
