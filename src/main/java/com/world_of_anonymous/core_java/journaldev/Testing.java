package com.world_of_anonymous.core_java.journaldev;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Testing {
  public static void main(String[] args) {

    // Sort array
    Integer arr[] = {5, 100, 27, 12, 58, 15, 20};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    // Sum of array
//    System.out.println("Sum of all element in array : "+Arrays.asList(arr).stream().mapToInt(Integer::intValue).sum());

    // Reverse list
//    List<Integer> list = new LinkedList<>();
//    list.add(12);
//    list.add(8);
//    list.add(9);
//    Collections.reverse(list);
//    System.out.println(list);
//    List<Integer> ll1 = new LinkedList<>();
//    ((LinkedList<Integer>) list).descendingIterator().forEachRemaining(ll1::add);
//    System.out.println(ll1);

    // Two array contain same element or not
    Integer[] a1 = {1,2,3,2,1};
    Integer[] a2 = {1,2,3};
    Integer[] a3 = {1,2,3};

    System.out.println(Arrays.equals(a1, a2));
    System.out.println(Arrays.deepEquals(a3, a2));
    System.out.println(Arrays.asList(a1).equals(Arrays.asList(a2)));

    // Date in specific format
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    System.out.println(format.format(new Date()));
  }
}
