//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//
//
//        firstHalf("WooHoo") → "Woo"
//        firstHalf("HelloThere") → "Hello"
//        firstHalf("abcdef") → "abc"

package com.intro;

public class firstHalf {
    public String firstHalf(String str) {
        String half =  str.substring(0, (str.length() / 2));

        return half;
    }

}
