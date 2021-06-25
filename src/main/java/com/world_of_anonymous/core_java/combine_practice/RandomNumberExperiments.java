package com.world_of_anonymous.core_java.combine_practice;

import java.util.Random;
import java.util.stream.Stream;

public class RandomNumberExperiments {
  public static void main(String[] args) {

    int[] arr = { 1,2,3,4,5,6,7,8,9,10 };
//    Arrays.asList(arr).sum();
    Stream.generate(() -> new Random().nextInt(arr.length)).distinct()
      .forEach(integer -> System.out.println(arr[integer]));
  }
}
