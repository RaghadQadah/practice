import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<Integer> list = new ArrayList<Integer>();
        Arrays.stream(nums).forEach(value -> list.add(value));
        int isSingle = nums[0];
        for (int i = 0; i < nums.length; i++) {
            list.remove(i);
            if (!list.contains(nums[i])) {
                isSingle = nums[i];
                break;
            }
            list.add(i,nums[i]);
        }
        System.out.println(isSingle);

    }
}
