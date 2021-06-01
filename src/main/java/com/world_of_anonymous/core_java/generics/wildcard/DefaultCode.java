package com.world_of_anonymous.core_java.generics.wildcard;

import java.util.List;

/**
 * Following method not worked with Integer or Double list because of type compatibility.
 * Integer and Double is derived class of Number.
 */
public class DefaultCode {
    public static double sum(List<Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Number> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        Number result1 = sum(numbers);
        System.out.println(result1);
//        List<Double> doubles = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
//        Double result2 = sum(doubles);
//        System.out.println(result2);
    }
}
