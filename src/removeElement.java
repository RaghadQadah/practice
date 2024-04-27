public class removeElement {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int k = 0;
        int j = 0;
        while (j < nums.length) {
            if (val == nums[j]) {
                j++;
                k++;
            } else {
                nums[j - k] = nums[j];
                j++;
            }
        }
        System.out.println("k=" + (nums.length - k));
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}