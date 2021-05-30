package com.world_of_anonymous.core_java.journaldev;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    // Complete the candies function below.
    static long candies(int n, int[] arr) {
      long count = 0;
      int[] newArr = new int[n];
      Arrays.fill(newArr, 1);
      for(int i=0; i<n; i++) {
        boolean flag=true;
//        if(i==0) {
//          newArr[i] = 1;
//        } else
        if(i!=0 && arr[i] > arr[i-1]) {
          newArr[i] = newArr[i-1] + 1;
          flag=false;
        } else if(i!=n-1 && arr[i] > arr[i+1]) {
          if (flag) {
           if (newArr[i+1] == 0)
             newArr[i+1] = 1;
           newArr[i] = newArr[i + 1] + 1;
         }
        }
//        else {
//          newArr[i] = 1;
//        }
        count += newArr[i];
      }
      return count + 2;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//
//      int n = scanner.nextInt();
//      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      int n = 8;
//      int[] arr = new int[n];
//      int[] arr = { 2,4,2,6,1,7,8,9,2,1 };
      int[] arr = { 2,4,3,5,2,6,4,5 };

//      for (int i = 0; i < n; i++) {
//        int arrItem = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        arr[i] = arrItem;
//      }


      long result = candies(n, arr);

//      bufferedWriter.write(String.valueOf(result));
//      bufferedWriter.newLine();
//
//      bufferedWriter.close();

      scanner.close();
    }
}
