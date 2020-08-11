//Given a string, return true if it ends in "ly".

package com.intro;

public class endsLy {
    public boolean endsLy(String str) {
        int length = str.length();

        if(length < 2) {
            return false;
        } else if(str.substring(length - 2).contains("ly")) {
            return true;
        } else {
            return false;
        }
    }


}
