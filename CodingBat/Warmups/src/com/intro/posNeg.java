//Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

package com.intro;

public class posNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else if ((a <= 0 && b > 0) || (b <= 0 && a > 0)) {
            return true;
        }
        return false;
    }

}
