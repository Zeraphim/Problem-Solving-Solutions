package com.zeraphim.SpringAPICall.CodingBat.e_Map1;

/*

Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.

mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}

*/

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class mapAB2 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "aaa");
        map1.put("c", "cake");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aaa");
        map2.put("b", "bbb");

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        map3.put("c", "aaa");

        System.out.println(mapAB2(map1));
        System.out.println(mapAB2(map2));
        System.out.println(mapAB2(map3));
    }

    private static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            if (Objects.equals(map.get("a"), map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }

        return map;
    }
}