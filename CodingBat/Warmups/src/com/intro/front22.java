//Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

package com.intro;

public class front22 {
    public String front22(String str) {
        String firstTwo;
        if (str.length() <= 2 ) {
            firstTwo = str;
        } else {
            firstTwo = str.substring(0,2);
        }
        return firstTwo + str + firstTwo;
    }

}
