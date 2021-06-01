package com.world_of_anonymous.core_java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * In following case we're try to store two different type of values inside same list object.
 * So at the time of evaluation casting generate an issue.
 * When you're working with the object who have various possibility of inputted value at this time this kind of situation occurred.
 * So the common solution is provide generic kind of input.
 */
public class ClassCastExceptionWithoutGenerics {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Dhwanil");
        list.add(5);

        for (Object obj : list) {
            String str = (String) obj;
            System.out.println(str);
        }
    }
}
