package stack;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {

    @Test
    public void testOne() {
        String s = "()";
        boolean validParantheses = findValidParantheses(s);
        System.out.println(validParantheses);
    }

    @Test
    public void testTwo() {
        String s = "()[]{}";
        boolean validParantheses = findValidParantheses(s);
        System.out.println(validParantheses);
    }

    @Test
    public void testThree() {
        String s = "([])";
        boolean validParantheses = findValidParantheses(s);
        System.out.println(validParantheses);
    }

    @Test
    public void testfour() {
        String s = "]";
        boolean validParantheses = findValidParantheses(s);
        System.out.println(validParantheses);
    }


    private boolean findValidParantheses(String s) {
        boolean result = false;
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (!stack.isEmpty() && stack.peek().equals(map.get(ch))) {
                result = true;
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.empty();
    }
}
