package com.world_of_anonymous.core_java.combine_practice;

import java.util.*;

/**
 * Collections.disjoint(a, b) : Method just verify not any of single object is common in both.
 *                              Length of both doesn't matter.
 */
public class CollectionMethods {
    public static void main(String[] args) {
        List<String> mylist1 = new ArrayList<String>();
        mylist1.add("practice");
        mylist1.add("code");
        mylist1.add("quiz");
        mylist1.add("geeksforgeeks");

        // Let us create vector of strings
        List<String>  mylist2 = new Vector<String>();
        mylist2.add("geeks");
        mylist2.add("geek");
        mylist2.add("for");
        mylist2.add("coder");

        // Let us create a vector
        List mylist3 = new Vector();

        mylist3.add(1);
        mylist3.add("practice");

        // Let us create a Set of strings
        Set<String> mylist4 = new HashSet<String>();
        mylist4.add("practice");
        mylist4.add("code");
        mylist4.add("quiz");
        mylist4.add("geeksforgeeks");

        disjointExample(mylist1, mylist2);
        disjointExample(mylist1, mylist3);
        disjointExample(mylist1, mylist4);
    }

    private static void disjointExample(Collection a, Collection b) {
        System.out.println(Collections.disjoint(a, b));
    }
}
