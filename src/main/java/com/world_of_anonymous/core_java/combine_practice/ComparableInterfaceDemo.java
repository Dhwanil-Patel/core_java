package com.world_of_anonymous.core_java.combine_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Comparable interface is mainly used to sort the arrays (or lists) of custom objects.
 * Lists (and arrays) of objects that implement Comparable interface can be sorted automatically by Collections.sort (and Arrays.sort).
 */
public class ComparableInterfaceDemo {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        // Method : 1

        //Manually call sort function
        Collections.sort(al, Collections.reverseOrder());
        al.forEach(student -> System.out.println(student.id + " " + student.name + " " + student.age));

        // Method : 2

        List fruits = new ArrayList();
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Guava");
        fruits.add("Grapes");

        Collections.sort(fruits);
        fruits.forEach(System.out::println);

        // Method : 3

        String[] fastfood = new String[] { "Burger", "Pizza", "Sandwich", "Momos", "French", "Fries" };
        Arrays.sort(fastfood);
        Arrays.asList(fastfood).forEach(System.out::println);

    }
}

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * This method contain logic for match various fields
     * Grater then param for ascending & less then for descending
     */
    @Override
    public int compareTo(Student o) {
        if (this.age == o.age) {
            return 0;
        } else if (this.age > o.age) {
            return 1;
        } else  {
            return -1;
        }
    }
}


