//Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.

package com.intro;

public class right2 {
    public String right2(String str) {
        String lastTwo = str.substring(str.length() - 2);
        String start = str.substring(0, str.length() - 2);

        return lastTwo + start;
    }

}
