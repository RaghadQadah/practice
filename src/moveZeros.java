import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        int[] nums = {0,0,1};
        int i = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != 0) {
                nums[i] = nums[k];
                i++;
            }
        }
        for (int j = i ; j < nums.length; j++) {
            nums[j] = 0;
        }
        Arrays.stream(nums).forEach(value -> System.out.println(value));
    }
}
