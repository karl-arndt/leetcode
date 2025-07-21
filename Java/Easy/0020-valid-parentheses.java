import java.util.HashMap;
import java.util.Stack;

class ValidParatheses {
    public boolean isValid(String s) {
        HashMap<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');
        closeToOpen.put(')', '(');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (closeToOpen.containsKey(s.charAt(i))) {
                if(!stack.isEmpty() && stack.peek() == closeToOpen.get(s.charAt(i))) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}