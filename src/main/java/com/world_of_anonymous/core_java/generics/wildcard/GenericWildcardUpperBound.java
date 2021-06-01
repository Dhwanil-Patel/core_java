package com.world_of_anonymous.core_java.generics.wildcard;

import java.util.List;

/**
 * This kind of implementation used when you allow your generic method
 * which defined with parent class, will also allow to to be working with child class data.
 *
 * In following case we define our generic as Number which is parent of Integer and Double.
 * So this both class also allow to pass as param using upper bound configuration.
 *
 * E.g. <? extends parent_class_name>
 */
public class GenericWildcardUpperBound {

    private static double sum(List<? extends Number> numbers) {
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
        List<Double> doubles = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        Double result2 = sum(doubles);
        System.out.println(result2);
    }
}
