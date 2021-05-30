package com.world_of_anonymous.core_java.string;

import java.util.ArrayList;
import java.util.List;

public class DuplicateString {
    public static void main(String[] args) {
        String str = "Big black bug bit a big black dog on his big black nose";
        String[] strArr = str.toLowerCase().split(" ");
        List<String> strList = new ArrayList<>();
        for (int i=0; i<strArr.length; i++) {
            if (!strList.contains(strArr[i])) {
                for (int j=i+1; j<strArr.length; j++) {
                    if (strArr[i].equals(strArr[j])) {
                        strList.add(strArr[i]);
                        break;
                    }
                }
            }
        }
        System.out.println(strList);
    }
}
