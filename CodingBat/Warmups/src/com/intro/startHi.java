// Given a string, return true if the string starts with "hi" and false otherwise.
package com.intro;

public class startHi {
    public boolean startHi(String str) {

        if (str.length() < 2 ) {
            return false;
        }
        else if (str.substring(0,2).equals("hi")) {
            return true;
        }
        else {
            return false;
        }
    }


}
