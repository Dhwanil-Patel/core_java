package com.world_of_anonymous.practice_project;

public class SortUsingBitwiseOperator {
    public static void main(String[] args) {
        isEvenOrOdd(-6);
    }

    private static void isEvenOrOdd(int value) {
        if ((value & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
