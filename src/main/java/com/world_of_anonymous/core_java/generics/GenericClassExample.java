package com.world_of_anonymous.core_java.generics;

import java.util.List;

public class GenericClassExample<T> {
    private T t;
    private List<T> tList;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public List<T> getList() {
        return tList;
    }

    public void setList(List<T> tList) {
        this.tList = tList;
    }

    public static void main(String[] args) {
        GenericClassExample<String> str1 = new GenericClassExample<>();
        str1.setT("Dhwanil");
        System.out.println(str1.getT());

        GenericClassExample<Integer> str2 = new GenericClassExample<>();
        str2.setT(15);
        System.out.println(str2.getT());

//        Don't print the value
        GenericClassExample str3 = new GenericClassExample();
        str3.setT("Dhwanil");
        System.out.println(str3);
        str3.setT(15);
        System.out.println(str3);

//        Fetch null on retrive
//        List<Integer> ints = new ArrayList<>();
//        SimpleGenericExample<List<Integer>> str3 = new SimpleGenericExample<>();
//        ints.add(5);
//        ints.add(10);
//        str2.setList(ints);
//        System.out.println(str3.getList());
    }
}
