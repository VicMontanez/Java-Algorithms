//Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

package com.intro;
import java.io.*;
import java.util.*;
import java.util.Scanner;  // Import the Scanner class

public class LetsReview {


    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object

            int age = myObj.nextInt();
            // String name = myObj.nextLine();
            // String name2 = myObj.nextLine();

            for(int c=0;c<age;c++) {
                String even = "";
                String odd = "";
                String myString = myObj.next();
                char[] charArray = myString.toCharArray();
                for (int i = 0; i < charArray.length; i += 2) {
                    even += charArray[i];
                }
                for (int j = 1; j < charArray.length; j += 2) {
                    odd += charArray[j];
                }
                System.out.println(even + " " + odd);
            }

            // Numerical input

            // System.out.println(age);
            // System.out.println(name);
            // System.out.println(name2);

        }
    }

}
