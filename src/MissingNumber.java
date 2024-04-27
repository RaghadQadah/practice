import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        List<Integer> list = new ArrayList<Integer>();
        Arrays.stream(nums).forEach(value -> list.add(value));
        int isMissing = nums[0];
        for (int i = 0; i <= nums.length; i++) {
            if (!list.contains(i)) {
                isMissing = i;
                break;
            }
        }
        System.out.println(isMissing);
    }
}
