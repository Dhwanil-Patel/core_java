package com.world_of_anonymous.core_java.comparable_and_comparator.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparableExample implements Comparable<StudentComparableExample> {

    int rollNo;
    String name;
    int age;

    public StudentComparableExample(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(StudentComparableExample stud) {
        if (this.age == stud.age) {
            return 0;
        } else if (this.age > stud.age) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        List<StudentComparableExample> students = new ArrayList<>();
        students.add(new StudentComparableExample(1, "Jay", 29));
        students.add(new StudentComparableExample(2, "Ajay", 24));
        students.add(new StudentComparableExample(3, "Vijay", 27));
        Collections.sort(students);
        students.forEach(student -> {
            System.out.println(student.rollNo + " " + student.name + " " + student.age);
        });
    }
}
