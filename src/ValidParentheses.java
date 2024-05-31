import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{()[]}";
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        System.out.println(map.get('}'));

        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    System.out.println(false);
                    break;
                }
                char top = stack.pop();
                if (map.get(top) != c) {
                    System.out.println(false);
                    break;
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}