package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp2;

/*

Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"

 */

public class stringBits {
    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
    }
    private static String stringBits(String str) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            newString.append(str.charAt(i));
        }

        return newString.toString();
    }
}