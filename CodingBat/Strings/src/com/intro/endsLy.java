//Given a string, return true if it ends in "ly".

package com.intro;

public class endsLy {
    public boolean endsLy(String str) {
        int length = str.length();
        String lastTwo = str.substring(str.length() - 2);

        if(length < 2) {
            return false;
        } else if(lastTwo.contains("ly")) {
            return true;
        } else {
            return false;
        }
    }

}
