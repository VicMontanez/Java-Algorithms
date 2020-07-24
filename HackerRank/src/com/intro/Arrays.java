//Given an array, of  integers, print 's elements in reverse order as a single line of space-separated numbers.

package com.intro;

import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Arrays {



    public static class Solution  {



        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = n - 1; i >= 0; i--) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
                System.out.print(arr[i] + " ");
            }

            scanner.close();
        }
    }

}
