package easy;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {

        System.out.println(isValid("[{}(])"));
    }


    public static boolean isValid(String s) {
        Stack<Character> brackets = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            switch (ch) {

                case '(':
                case '{':
                case '[':
                    brackets.push(ch);
                    break;

                case ']':
                    if (!brackets.isEmpty() && brackets.peek() == '[')
                        brackets.pop();
                    else
                        brackets.push(ch);
                    break;

                case ')':
                    if (!brackets.isEmpty() && brackets.peek() == '(')
                        brackets.pop();
                    else
                        brackets.push(ch);
                    break;

                case '}':
                    if (!brackets.isEmpty() && brackets.peek() == '{')
                        brackets.pop();
                    else
                        brackets.push(ch);
                    break;
            }
        }
        return brackets.isEmpty();
    }
}
