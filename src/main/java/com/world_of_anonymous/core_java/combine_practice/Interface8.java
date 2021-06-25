package com.world_of_anonymous.core_java.combine_practice;

interface IMain {
    static void method() {
        System.out.println("Interface method");
    }

    default void method1() {
        System.out.println("Default method 1");
    }
}

interface IChild {
    static void method() {
        System.out.println("Interface method");
    }

    default void method1() {
        System.out.println("Default method 2");
    }
}

interface IMaster {

}

public class Interface8 implements IMain, IChild {
    public static void main(String[] args) {
        Interface8 i8 = new Interface8();
        i8.method1();
    }

    @Override
    public void method1() {
        IChild.super.method1();
    }
}
