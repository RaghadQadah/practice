import java.util.Stack;

public class PolishNotation {
    public static void main(String[] args) {

        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int value1 = stack.pop();
                int value2 = stack.pop();
                String operator = token;
                if (operator.equals("+")) {
                    stack.push(value2 + value1);
                } else if (operator.equals("-")) {
                    stack.push(value2 - value1);
                } else if (operator.equals("*")) {
                    stack.push(value2 * value1);
                } else if (operator.equals("/")) {
                    stack.push(value2 / value1);
                }

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        System.out.println(stack.pop());
    }
}