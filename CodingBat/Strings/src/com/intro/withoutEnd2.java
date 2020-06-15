//Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

package com.intro;

public class withoutEnd2 {
    public String withouEnd2(String str) {
        if (str.length() < 3) {
            return "";
        }
        else  {
            return str.substring(1, str.length() - 1);
        }
    }

}
