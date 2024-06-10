import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class nextGraterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];
        int[] nextGreater = new int[nums2.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.fill(answer, -1);
        Arrays.fill(nextGreater, -1);


        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {
            while (stack.size() > 0 && nums2[stack.peek()] < nums2[i]) {
                nextGreater[stack.pop()] = nums2[i];
            }
            stack.push(i);
        }

        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], nextGreater[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                answer[i] = map.get(nums1[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        nextGraterElement ng = new nextGraterElement();
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {3, 5, 2, 3, 7};
        System.out.println(ng.nextGreaterElement(nums1, nums2)[0]);
        System.out.println(ng.nextGreaterElement(nums1, nums2)[1]);
        System.out.println(ng.nextGreaterElement(nums1, nums2)[2]);
    }
}
