//Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator

package com.intro;

public class old35 {
    public boolean old35(int n) {
        if (n % 3 == 0 ^ n % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
