package com.zeraphim.SpringAPICall.CodingBat.e_Map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*

Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.

mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}

 */

public class mapAB3 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("c", "cake");

        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "bbb");
        map2.put("c", "cake");

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        map3.put("c", "cake");

        System.out.println(mapAB3(map1));
        System.out.println(mapAB3(map2));
        System.out.println(mapAB3(map3));
    }

    private static Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        }

        if (map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }

        return map;
    }
}