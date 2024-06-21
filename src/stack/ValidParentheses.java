package stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        // basic uneven
        String s = "(]";
        System.out.println(isValid(s)); // false

        // odd length
        s = "([)";
        System.out.println(isValid(s)); // false

        // order matters too
        s = "([)]";
        System.out.println(isValid(s)); // false

        // basic even
        s = "([])";
        System.out.println(isValid(s)); // true

        // intermediate even
        s = "()[]{}";
        System.out.println(isValid(s)); // true

        // intermediate even
        s = "((";
        System.out.println(isValid(s)); // false

        // intermediate even
        s = "){";
        System.out.println(isValid(s)); // false
    } // main

    public static boolean isValid(String s) {
        // if string is of odd length, there is half a bracket present somewhere
        if (s.length() % 2 != 0) {
            return false;
        }
        else {
            Stack<Character> stack = new Stack<>();

            // search for left-side brackets
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) == '(') || (s.charAt(i) == '[') || (s.charAt(i) == '{')) {
                    stack.push(s.charAt(i));
                }
                else {
                    // if stack is empty and we have a right side bracket, we're immediately out of order
                    if (stack.empty()) {
                        return false;
                    }

                    // if it's not the same as the ascii character 1 or 2 steps above
                    if ((s.charAt(i) != (stack.peek() + 1)) && (s.charAt(i) != (stack.peek() + 2))) {
                        return false;
                    }
                    else {
                        stack.pop();
                    }
                }
            } // for

            return stack.empty();
        }
    } // isValid
}