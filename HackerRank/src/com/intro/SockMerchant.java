package com.intro;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {


    public static class Solution {

        // https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/

        // Complete the sockMerchant function below.
        static int sockMerchant(int n, int[] ar) {
            int pairs = 0;

            // Create empty hash map
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            // Add ar indexes to the map
            for (int i = 0; i < ar.length; i++) {
                if (!map.containsKey(ar[i])) {
                    map.put(ar[i], 1);
                } else {
                    map.put(ar[i], map.get(ar[i]) + 1);
                }
            }

            // System.out.println(map);

            // Loop through the hash map
            for (Map.Entry socks : map.entrySet()) {
                System.out.println(pairs += (int) socks.getValue() / 2);
            }
            return pairs;

        }

        private static final 
    }
}