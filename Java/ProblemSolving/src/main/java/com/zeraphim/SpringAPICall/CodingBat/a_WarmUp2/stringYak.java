package com.zeraphim.SpringAPICall.CodingBat.a_WarmUp2;

/*

Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"

 */

public class stringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));
    }

    private static String stringYak(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); ) {
            // Check if current and next 2 characters match the "yak" pattern
            if (i + 2 < str.length()
                    && str.charAt(i) == 'y'
                    && str.charAt(i + 2) == 'k') {
                i += 3; // Skip the "yak"-like pattern
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }
        return result.toString();
    }

    // Using RegEx incurs more operational overhead and extra processing time
    // Not that efficient
    private static String stringYakRegex(String str) {
        return str.replaceAll("y.k", "");
    }
}
