package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp1;

/*

Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false

 */

public class mixStart {
    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
        System.out.println(mixStart("nix"));
        System.out.println(mixStart("ni"));
        System.out.println(mixStart("n"));
        System.out.println(mixStart(""));
    }

    public static boolean mixStart(String str) {
        boolean hasMix = str.length() >= 3
                && str.charAt(1) == 'i'
                && str.charAt(2) == 'x';

        return hasMix;
    }
}