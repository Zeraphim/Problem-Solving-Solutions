package com.zeraphim.SpringAPICall.CodingBat.e_Map1;

/*

Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".

topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}

 */

import java.util.HashMap;
import java.util.Map;

public class topping3 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("potato", "ketchup");

        Map<String, String> map2 = new HashMap<>();
        map2.put("potato", "butter");

        Map<String, String> map3 = new HashMap<>();
        map3.put("salad", "oil");
        map3.put("potato", "ketchup");

        System.out.println(topping3(map1));
        System.out.println(topping3(map2));
        System.out.println(topping3(map3));
    }

    private static Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }

        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }

        return map;
    }
}