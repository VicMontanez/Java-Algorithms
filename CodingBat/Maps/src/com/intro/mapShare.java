//Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.

package com.intro;

import java.util.Map;

public class mapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        if(map.containsKey("a")) {
            map.put("b", map.get("a")); //get "b" to be whatever the value of "a" is
            map.remove("c"); //remove the value of "c"
        } else {
            map.remove("c"); // remove the value of "c" even if there is no value for "a"
        }
        return map;
    }

}
