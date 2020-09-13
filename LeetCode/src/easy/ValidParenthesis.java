package easy;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * An input string is valid if:
 * <p>
 * -*- Open brackets must be closed by the same type of brackets.
 * -*- Open brackets must be closed in the correct order.
 * <p>
 * <p>
 * Example 1:
 * Input: s = "()"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * <p>
 * Example 3:
 * Input: s = "(]"
 * Output: false
 * <p>
 * Example 4:
 * Input: s = "([)]"
 * Output: false
 * <p>
 * Example 5:
 * Input: s = "{[]}"
 * Output: true
 */


public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("[{}(])"));
    }


    public static boolean isValid(String s) {
        if (s.length() == 0 || s.length() == 1)
            return false;
        Stack<Character> brackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                brackets.push(ch);
            } else if (ch == ']' && !brackets.isEmpty() && brackets.peek() == '[') {
                brackets.pop();
            } else if (ch == ')' && !brackets.isEmpty() && brackets.peek() == '(') {
                brackets.pop();
            } else if (ch == '}' && !brackets.isEmpty() && brackets.peek() == '{') {
                brackets.pop();
            } else {
                return false;
            }
        }
        return brackets.size()==0;
    }
}
