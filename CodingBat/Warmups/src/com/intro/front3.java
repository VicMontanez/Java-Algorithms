//Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.



        package com.intro;

public class front3 {
    public String front3(String str) {
        String three;

        if (str.length() >= 3) {
            three = str.substring(0,3);
        } else {
            three = str;
        }
        return three + three + three;
    }
}
