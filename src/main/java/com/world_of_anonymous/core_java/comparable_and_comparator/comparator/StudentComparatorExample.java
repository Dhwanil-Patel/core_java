package com.world_of_anonymous.core_java.comparable_and_comparator.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jay", 29));
        students.add(new Student(2, "Ajay", 24));
        students.add(new Student(3, "Vijay", 27));

        System.out.println("Sort by Age : ");
        Collections.sort(students, new AgeComparator());
        students.forEach(student -> System.out.println(student.rollNo + " " + student.name + " " + student.age));

        System.out.println("Sort by Name : ");
        Collections.sort(students, new NameComparator());
        students.forEach(student -> System.out.println(student.rollNo + " " + student.name + " " + student.age));

        System.out.println("Sort by ID : ");
        Collections.sort(students, (o1, o2) -> {
            if (o1.rollNo == o2.rollNo)
                return 0;
            else if (o1.rollNo > o2.rollNo)
                return 1;
            else
                return -1;
        });
        students.forEach(student -> System.out.println(student.rollNo + " " + student.name + " " + student.age));
    }
}
