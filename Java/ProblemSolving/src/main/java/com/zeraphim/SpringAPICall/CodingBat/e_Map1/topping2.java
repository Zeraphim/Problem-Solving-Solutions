package com.zeraphim.SpringAPICall.CodingBat.e_Map1;

/*

Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".

topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
topping2({"yogurt": "salt"}) → {"yogurt": "salt"}

 */

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class topping2 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "cherry");

        Map<String, String> map2 = new HashMap<>();
        map2.put("spinach", "dirt");
        map2.put("ice cream", "cherry");

        Map<String, String> map3 = new HashMap<>();
        map3.put("yogurt", "salt");

        System.out.println(topping2(map1));
        System.out.println(topping2(map2));
        System.out.println(topping2(map3));
    }

    private static Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            if (!Objects.equals(map.get("yogurt"), "cherry") || !map.containsKey("yogurt")) {
                map.put("yogurt", "cherry");
            }

            map.put("yogurt", map.get("ice cream"));
        }

        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }

        return map;
    }
}