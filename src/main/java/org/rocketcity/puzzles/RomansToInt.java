package org.rocketcity.puzzles;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RomansToInt {

    private static Stack<Character> roman;
    private static Map<Character, Integer> valuesMap;

    public RomansToInt() {
        roman = new Stack<>();
        valuesMap = new HashMap<>();
        valuesMap.put('I', 1);
        valuesMap.put('V', 5);
        valuesMap.put('X', 10);
        valuesMap.put('L', 50);
        valuesMap.put('C', 100);
        valuesMap.put('D', 500);
        valuesMap.put('M', 1000);
    }

    public static int romanToInt(String romanInput) {
        if (validRoman(romanInput)) {
            readRomanInput(romanInput);
        }
        int sum = 0;

        while (!roman.empty()) {
            char focusChar = roman.pop();
            if(roman.empty()){
                sum += numericValue(focusChar);
            }
            else if (greaterThanOrEqual(focusChar, roman.peek())) {
                sum += numericValue(focusChar);
            } else {
                char nextFocus = roman.pop();
                sum = sum + (numericValue(nextFocus) - numericValue(focusChar));
            }
        }

        return sum;
    }

    private static int numericValue(char romanChar) {
        return valuesMap.get(romanChar);
    }

    private static boolean greaterThanOrEqual(char roman1, char roman2) {
        return valuesMap.get(roman1) >= valuesMap.get(roman2);
    }


    private static boolean validRoman(String romanInput) {
        return validLength(romanInput) && validRomanNumerals(romanInput);
    }

    private static boolean validLength(String romanInput) {
        if (romanInput.length() > 15) {
            return false;
        }
        return true;
    }

    private static boolean validRomanNumerals(String romanInput) {
        char[] characters = romanInput.toCharArray();
        for (char character : characters) {
            if (!valuesMap.containsKey(character)) {
                return false;
            }
        }
        return true;
    }

    private static void readRomanInput(String romanInput) {
        char[] chars = romanInput.toCharArray();
        for (int i = chars.length-1; i>=0; i--) {
            roman.push(chars[i]);
        }
    }

}


/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two ones added together.
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII,
 * which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * Example 2:
 * <p>
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 3:
 * <p>
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
