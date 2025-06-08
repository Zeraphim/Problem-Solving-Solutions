package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp2;

/*

Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"

k i t t e n
0 1 2 3 4 5    8  9
  - -   - -

 */

public class allPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    private static String altPairs(String str) {
        StringBuilder newString = new StringBuilder();

        // We can do module 4 to check if i is within the indexes of
        // 0,1, 4,5, 8,9 ...
        for (int i = 0; i < str.length(); i++) {
            if (i % 4 <= 1) {
                newString.append(str.charAt(i));
            }
        }

        return newString.toString();
    }
}
