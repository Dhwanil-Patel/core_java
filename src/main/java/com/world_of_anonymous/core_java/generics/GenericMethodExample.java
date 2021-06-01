package com.world_of_anonymous.core_java.generics;

public class GenericMethodExample {

    private static <T> boolean isEqual(GenericClassExample<String> g1, GenericClassExample<String> g2) {
        return g1.getT().equals(g2.getT());
    }

    public static void main(String[] args) {
        GenericClassExample<String> str1 = new GenericClassExample<>();
        str1.setT("Dhwanil");
        GenericClassExample<String> str2 = new GenericClassExample<>();
//        str2.setT("Dhwanil");
        str2.setT("Patel");

        boolean result = GenericMethodExample.isEqual(str1, str2);
        if (result) {
            System.out.println("Both the values are equal.");
        } else {
            System.out.println("Both the values aren't equal.");
        }
    }
}
