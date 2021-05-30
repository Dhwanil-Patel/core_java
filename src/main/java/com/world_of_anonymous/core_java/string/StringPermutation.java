package com.world_of_anonymous.core_java.string;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "abc";
        generatePermutation(str, 0, str.length());
    }

    private static void generatePermutation(String str, int start, int end) {
        if (start == end-1) {
            System.out.println(str);
        } else {
            char ch = '\u0000';
            for (int i=start; i<end; i++) {
                str = swapString(str.toCharArray(), ch, start, i);
                generatePermutation(str, start+1, end);
                str = swapString(str.toCharArray(), ch, start, i);
            }
        }
    }

    private static String swapString(char[] charArr, char ch, int i, int j) {
//        System.out.println("Str : "+str+" , str(i) : "+str.charAt(i)+" , str(i) : "+str.charAt(j));
        ch = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = ch;
        return String.valueOf(charArr);
    }
}
