package com.world_of_anonymous.core_java.comparable_and_comparator.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student stud1, Student stud2) {
        if (stud1.age == stud2.age)
            return 0;
        else if (stud1.age > stud2.age)
            return 1;
        else
            return -1;
    }
}
