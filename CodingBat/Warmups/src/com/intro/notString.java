//Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

package com.intro;

public class notString {
    public String notString(String str) {
        String not = "not";
        if (str.length()>=3 && str.substring(0,3).contains(not)) {
            return str;
        }
        return not + " " + str;

    }
}
