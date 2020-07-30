//Given a non-negative number "num", return true if num is within 2 of a multiple of 10.

package com.intro;

public class nearTen {
    public boolean nearTen(int num) {
        if ((num + 2) % 10 == 0) {
            return true;
        } else if((num - 2) % 10 == 0) {
            return true;
        }
        else
            return false;
    }


}
