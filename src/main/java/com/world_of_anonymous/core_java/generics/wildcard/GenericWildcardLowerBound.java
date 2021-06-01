package com.world_of_anonymous.core_java.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * This kind of implementation used when you allow your generic method
 * which defined with child class, will also allow to to be working with parent class data.
 *
 * In following case we define our generic as Integer which is child of Number and Object.
 * So this both class also allow to pass as param using lower bound configuration.
 *
 * E.g. <? super child_class_name>
 */
public class GenericWildcardLowerBound {

    private static void addInteger(List<? super Integer> list) {
        Integer val = Integer.valueOf(50);
        list.add(val);
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        addInteger(intList);
        intList.forEach(System.out::print);

        System.out.println();

        List<Number> numList = new ArrayList<>();
        numList.add(1.0);
        numList.add(2.0);
        numList.add(3.0);
        numList.add(4.0);
        numList.add(5.0);
        addInteger(numList);
        numList.forEach(System.out::print);
    }
}
