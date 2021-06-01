package com.world_of_anonymous.core_java.generics.wildcard;

import java.util.List;

/**
 * This kind of implementation used when you want allow our generic method to be working with all types.
 * In following case we allow all kind of data list as parameter.
 *
 * E.g. <?>
 */
public class GenericWildcardUnbound {

    private static void printData(List<?> numbers) {
        for (Object obj : numbers) {
            System.out.print(obj + "::");
        }
    }

    public static void main(String[] args) {

        List<Double> doubles = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        printData(doubles);
        System.out.println();
        List<String> names = List.of("Jay", "Ajay", "Viay", "Sanjay", "Dhananay");
        printData(names);
    }
}
