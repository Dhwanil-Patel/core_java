package com.world_of_anonymous.core_java.generics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * We know that Java inheritance allows us to assign a variable A to another variable B if A is subclass of B.
 * So we might think that any generic type of A can be assigned to generic type of B, but it’s not the case.
 *
 * We are not allowed to assign MyClass<String> variable to MyClass<Object> variable because they are not related, in fact MyClass<T> parent is Object.
 */
public class GenericTypeAndInheritance {

    private  static Logger log = LoggerFactory.getLogger(GenericTypeAndInheritance.class);

    public static void main(String[] args) {

        String str = "abc";
        Object obj = new Object();
        obj = str; // Every class is sub class of object class

        System.out.println(obj);

        GenericClassExample<String> gen1 = new GenericClassExample<>();
        GenericClassExample<Object> gen2 = new GenericClassExample<>();

        // Object type defined by Generic and with real object both are different.
        // Generic object allocated to normal object, but it not allocated to other generic object with different type.
//        gen1 = gen2;

        obj = gen1;

    }
}
