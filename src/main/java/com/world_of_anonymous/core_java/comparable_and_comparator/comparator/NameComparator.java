package com.world_of_anonymous.core_java.comparable_and_comparator.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student stud1, Student stud2) {
        return stud1.name.compareTo(stud2.name);
    }
}
