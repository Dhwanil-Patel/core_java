package com.world_of_anonymous.core_java.generics.BoundedType;

/**
 * In given situation bound also check extended type.
 * Here in extended type use Comparable which is not extended in StudentWithoutComparable. So you get the exception (Remove comments)
 * It's worked in case of StudentComparable because it extends Comparable<T>
 */
public class GenericBoundTypeParameterExample {
    public static void main(String[] args) {

        StudentComparable stud1 = new StudentComparable(1, "Jay", 29);
        StudentComparable stud2 = new StudentComparable(2, "Ajay", 24);
        int compare = GenericBoundedTypeParameter.compare(stud1, stud2);
        System.out.println(compare);

//        StudentWithoutComparable stud3 = new StudentWithoutComparable(1, "Jay", 29);
//        StudentWithoutComparable stud4 = new StudentWithoutComparable(2, "Ajay", 24);
//        compare = GenericBoundedTypeParameter.compare(stud3, stud4);
//        System.out.println(compare);
    }
}
