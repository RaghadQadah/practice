import java.util.Arrays;
import java.util.Stack;

public class DailyTemp {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        DailyTemp dt = new DailyTemp();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dt.dailyTemperatures(temperatures);
        // Output: [1, 1, 4, 2, 1, 1, 0, 0]
        System.out.println(Arrays.toString(result));
    }
}
