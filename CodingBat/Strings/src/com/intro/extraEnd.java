//Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
//
//
//        extraEnd("Hello") → "lololo"
//        extraEnd("ab") → "ababab"
//        extraEnd("Hi") → "HiHiHi"

package com.intro;

public class extraEnd {
    public String extraEnd(String str) {
        String newString = "";

        if (str.length() > 2)
        {
            newString = str.substring(str.length() - 2);
        }
        else
        {
            newString = str;
        }

        return newString + newString + newString;
    }


}
