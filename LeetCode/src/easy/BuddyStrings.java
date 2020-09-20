package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B.
 * <p>
 * Example 1:
 * <p>
 * Input: A = "ab", B = "ba"
 * Output: true
 * Example 2:
 * <p>
 * Input: A = "ab", B = "ab"
 * Output: false
 * Example 3:
 * <p>
 * Input: A = "aa", B = "aa"
 * Output: true
 * Example 4:
 * <p>
 * Input: A = "aaaaaaabc", B = "aaaaaaacb"
 * Output: true
 * Example 5:
 * <p>
 * Input: A = "", B = "aa"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= A.length <= 20000
 * 0 <= B.length <= 20000
 * A and B consist only of lowercase letters.
 */

public class BuddyStrings {

    public static void main(String[] args) {
        System.out.println(buddyStrings("abab", "abab"));
    }

    public static boolean buddyStrings(String A, String B) {

        int lenA = A.length();
        int lenB = B.length();

        // use for modification in String chars
        StringBuilder strB = new StringBuilder(B);
        Map<Character, Integer> keys = new HashMap<Character, Integer>();
        boolean isDiff = false;

        if (lenA != lenB) // case 1
            return false;
        else {
            for (int i = 0; i < lenB - 1; i++) {
                char charIndexA = A.charAt(i);
                char charIndexB = B.charAt(i);
                keys.put(charIndexA, 1);
                keys.put(charIndexB, 1);

                if (charIndexA != charIndexB) // case 2
                {
                    char pos1 = B.charAt(i);
                    char pos2 = B.charAt(i + 1);

                    strB.setCharAt(i, pos2);
                    strB.setCharAt(i + 1, pos1);
                    isDiff = true;
                    break;
                }

            }

            // add remaining items
            if (lenA > 0) {
                keys.put(A.charAt(lenA - 1), 1);
                keys.put(B.charAt(lenB - 1), 1);
            }

            String resultStr = strB.toString();

            if (keys.size() == 1) // case 3 for frequency count
                return true;
            else if (resultStr.equals(A) && !isDiff) // case 4 for both string completely equals
                return false;
            else
                return resultStr.equals(A);

        }

    }


}
