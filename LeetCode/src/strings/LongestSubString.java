package strings;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * Given a string, find the length of the longest substring without repeating characters.

    Example 1:

    Input: "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.

    Example 2:

    Input: "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.

    Example 3:

    Input: "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
* */
public class LongestSubString {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    // This is brute force Approach time complexity O(n2)
    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int res = 0;

        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (chars.contains(s.charAt(j))) {
                    chars.clear();
                    break;
                } else {
                    chars.add(s.charAt(j));
                }
                res = Math.max(res, chars.size());
            }
        }
        return res;
    }
}
