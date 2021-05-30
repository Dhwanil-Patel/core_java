package com.world_of_anonymous.core_java.string;

public class FindLogestRepetitiveStringInsideString {
    public static void main(String[] args) {
        String lrs = "";
        String str = "acbdfghybdf";
        int n = str.length();
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                String s1 = lcp(str.substring(i, n), str.substring(j, n));
                if (s1.length() > lrs.length()) {
                    lrs = s1;
                }
            }
        }
        System.out.println("Longest repeating sequence :"+lrs);
    }

    private static String lcp(String first, String second) {
        int n = Math.min(first.length(), second.length());
        for (int i=0; i<n; i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return first.substring(0, i);
            }
        }
        return first.substring(0, n);
    }
}
