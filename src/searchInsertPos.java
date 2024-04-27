public class searchInsertPos {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        int index = 0;
//        for (int i = 0; i < nums.length && nums[i] < target; i++) {
//            index++;
//        }
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] < target) {
                index = i+1;
            }
        }
        System.out.println(index);

    }
}
