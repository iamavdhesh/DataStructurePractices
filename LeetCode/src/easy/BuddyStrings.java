package easy;

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
        System.out.println(buddyStrings("aa", "aa"));
    }

    public static boolean buddyStrings(String A, String B) {

        int lenA = A.length();
        int lenB = B.length();

        // use for modification in String chars
        StringBuilder strB = new StringBuilder(B);

        int isChecked = 0;

        if (lenA != lenB)
            return false;// Case 1
        else {
            for (int i = 0; i < lenB - 1; i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    char pos1 = B.charAt(i);
                    char pos2 = B.charAt(i + 1);

                    strB.setCharAt(i, pos2);
                    strB.setCharAt(i + 1, pos1);
                    isChecked++;
                    break;
                }

            }

            String resultStr = strB.toString();
            return resultStr.equals(A);

        }

    }
}
