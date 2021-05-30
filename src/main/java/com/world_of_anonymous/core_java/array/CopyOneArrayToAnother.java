package com.world_of_anonymous.core_java.array;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CopyOneArrayToAnother {
    private static final Logger log = LoggerFactory.getLogger(CopyOneArrayToAnother.class);
    public static void main(String[] args) {
        int[] ints1 = IntStream.rangeClosed(1, 10).toArray();
        print(ints1);
        int[] ints2 = ints1.clone();
        print(ints2);
        int[] ints3 = Arrays.copyOf(ints1, ints1.length);
        print(ints3);
    }

    private static void print(int[] arrInt) {
        for (int i=0; i<arrInt.length; i++) {
            System.out.print(arrInt[i]);
        }
        System.out.println();
    }
}
