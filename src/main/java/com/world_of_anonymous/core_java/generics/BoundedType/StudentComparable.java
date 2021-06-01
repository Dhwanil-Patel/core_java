package com.world_of_anonymous.core_java.generics.BoundedType;

public class StudentComparable implements Comparable<StudentComparable> {

    int id;
    String name;
    int age;

    public StudentComparable(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(StudentComparable o) {
        if (this.age == o.age)
            return 0;
        else if (this.age > o.age)
            return 1;
        else
            return -1;
    }
}
