import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinStack {
    private List<Integer> data;
    private int min;

    public MinStack() {
        data = new ArrayList<>();
    }

    public void push(int val) {
        data.add(val);
        min = Collections.min(data);

    }

    public void pop() {
        if (!data.isEmpty())
            if (top() == min) {
                data.removeLast();
                if (!data.isEmpty())
                    min = Collections.min(data);
            } else {
                data.removeLast();
            }
    }

    public int top() {
        return (data.isEmpty()) ? 0 : data.get(data.size() - 1);
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);

        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.push(2147483647);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.push(-2147483648);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());


    }
}


