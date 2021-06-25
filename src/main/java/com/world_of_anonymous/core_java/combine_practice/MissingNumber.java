package com.world_of_anonymous.core_java.combine_practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {
    private static Logger log = LoggerFactory.getLogger(MissingNumber.class);
    public static void main(String[] args) {
        int size = 15;
        int [] arr ={1,7,3,5,6,8,10,9};
        IntStream range = IntStream.range(0, size);
        List<Integer> collect = range.boxed().collect(Collectors.toList());
        collect.removeAll(Arrays.asList(arr));
        collect.forEach(value -> System.out.println(value));

    }
}
