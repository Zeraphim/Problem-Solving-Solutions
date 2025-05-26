package com.zeraphim.SpringAPICall.CodingBat.c_Logic1;

/*

Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"

 */

public class fizzString {
    public static void main(String[] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));
    }

    private static String fizzString(String str) {
        boolean isFirstF =  str.toLowerCase().charAt(0) == 'f';
        boolean isLastB = str.toLowerCase().charAt(str.length() - 1) == 'b';

        if (isFirstF && isLastB) {
            return "FizzBuzz";
        } else if (isFirstF) {
            return "Fizz";
        } else if (isLastB) {
            return "Buzz";
        }

        return str;
    }

    private static String fizzStringAppend(String str) {
        StringBuilder result = new StringBuilder();
        String lower = str.toLowerCase();

        if (lower.startsWith("f")) result.append("Fizz");
        if (lower.endsWith("b")) result.append("Buzz");

        return result.length() > 0 ? result.toString() : str;
    }
}