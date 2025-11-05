package com.zeraphim.SpringAPICall.CodingBat.e_Map1;

/*

Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".

mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}

 */

import java.util.HashMap;
import java.util.Map;

public class mapAB {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");

        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "There");

        System.out.println(mapAB(map1));
        System.out.println(mapAB(map2));
        System.out.println(mapAB(map3));
    }

    private static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey(("b"))) {
            map.put("ab", map.get("a") + map.get("b"));
        }

        return map;
    }
}