package com.zeraphim.SpringAPICall.CodingBat.e_Map1;

import java.util.HashMap;
import java.util.Map;

/*

Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.

mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}

 */

public class mapAB4 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bb");
        map1.put("c", "cake");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aa");
        map2.put("b", "bbb");
        map2.put("c", "cake");

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aa");
        map3.put("b", "bbb");

        System.out.println(mapAB4(map1));
        System.out.println(mapAB4(map2));
        System.out.println(mapAB4(map3));
    }

    private static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String maxStringVal = "";

            if (map.get("a").length() != map.get("b").length()) {
                if (map.get("a").length() > map.get("b").length()) {
                    maxStringVal = map.get("a");
                } else {
                    maxStringVal = map.get("b");
                }

                map.put("c", maxStringVal);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }

        return map;
    }

    private static Map<String, String> mapAB4Ternary(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String maxStringVal = "";

            if (map.get("a").length() != map.get("b").length()) {
                if (map.get("a").length() > map.get("b").length()) {
                    maxStringVal = map.get("a");
                } else {
                    maxStringVal = map.get("b");
                }

                map.put("c", maxStringVal);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }

        return map;
    }

    private static Map<String, String> mapAB4NullCheck(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String maxStringVal = "";

            if (map.get("a").length() != map.get("b").length()) {
                if (map.get("a").length() > map.get("b").length()) {
                    maxStringVal = map.get("a");
                } else {
                    maxStringVal = map.get("b");
                }

                map.put("c", maxStringVal);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }

        return map;
    }
}