package com.world_of_anonymous.core_java.string;

public class FindSubsetOfString {
    public static void main(String[] args) {
        String str= "FUN";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            for (int j=i+1; j<=str.length(); ++j) {
                sb.append(str.substring(i,j).concat(", "));
            }
        }
        System.out.println(sb.toString());
    }
}
