package com.world_of_anonymous.core_java.string;

public class GeneratePatternAndCountPunctuationCharacters {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n/2) {
                    if (j <= i || j >= n - i - 1) {
                        System.out.print("*");
                        count++;
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    int val = i % (n/2) + 1;
                    if (j <= n/2 - val - 1 || j >= n/2 + val) {
                        System.out.print("*");
                        count++;
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
        System.out.println(count);
    }
}
