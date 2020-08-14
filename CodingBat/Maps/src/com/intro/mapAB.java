//Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".

package com.intro;

import java.util.Map;


public class mapAB {
    public Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")) { // if statement if both keys have strings
            String ab = ""; // create empty string for ab
            map.put("ab", map.get("a")+map.get("b")); //bind strings and put them in ab variable
        }
        return map;
    }

}
