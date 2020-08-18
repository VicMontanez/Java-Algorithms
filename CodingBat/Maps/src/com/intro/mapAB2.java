//Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.

package com.intro;

public class mapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
        String a = map.get("a");
        String b = map.get("b");
        if(map.containsKey("a") && map.containsKey("b")) {
            if (a.equals(b)) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }

}
