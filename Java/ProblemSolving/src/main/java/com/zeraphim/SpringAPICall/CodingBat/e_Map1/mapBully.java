package com.zeraphim.SpringAPICall.CodingBat.e_Map1;

/*

Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.

mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}

 */

import java.util.HashMap;
import java.util.Map;

public class mapBully {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "candy");
        map1.put("b", "dirt");
        System.out.println(mapBully(map1));

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "candy");
        System.out.println(mapBully(map2));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "candy");
        map3.put("b", "carrot");
        map3.put("c", "meh");
        System.out.println(mapBully(map3));
    }

    private static Map<String, String> mapBully(Map<String, String> map) {
        Map<String, String> result = new HashMap<>(map);

        if (result.containsKey("a")) {
            result.put("b", result.get("a"));
        }

        if (result.containsKey("a")) {
            result.put("a", "");
        }

        return result;
    }
}