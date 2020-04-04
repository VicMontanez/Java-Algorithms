//Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
//
//
//        nonStart("Hello", "There") → "ellohere"
//        nonStart("java", "code") → "avaode"
//        nonStart("shotl", "java") → "hotlava"

package com.intro;

public class nonStart {
    public String nonStart(String a, String b) {
        String newA = a.substring(1);
        String newB = b.substring(1);
        return newA + newB;
    }
}
