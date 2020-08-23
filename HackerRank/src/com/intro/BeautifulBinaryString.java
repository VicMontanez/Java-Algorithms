//Alice has a binary string. She thinks a binary string is beautiful if and only if it doesn't contain the substring "010" .
//
//In one step, Alice can change a 0 to a 1 or vice versa. Count and print the minimum number of steps needed to make Alice see the string as beautiful.

package com.intro;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulBinaryString {

    // Complete the beautifulBinaryString function below.
    static int beautifulBinaryString(String b) {
        // int counter = 0;
        // int stringLength = b.length();
        // String ugly = "010";

        // for(int i =0; i<=stringLength - 3;) {
        //     String testcase = b.substring(i, i + 3);
        //     if(testcase.equals(ugly)) {
        //         counter++;
        //         i += 3;
        //     } else {
        //         i++;
        //     }
        // }

        return b.length() - b.replaceAll("010", "11").length();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String b = scanner.nextLine();

        int result = beautifulBinaryString(b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
