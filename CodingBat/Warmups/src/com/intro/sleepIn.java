package com.intro;

public class sleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation == true || weekday == false) {
            return true;
        }

        return false;
    }
}
