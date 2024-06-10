public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(nums, target, 0, 0);
    }

    private int backtrack(int[] nums, int target, int index, int currentSum) {
        // Base case: If we've considered all numbers
        if (index == nums.length) {
//            return currentSum == target ? 1 : 0;
            if (currentSum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        // Recursive case: Try adding and subtracting the current number
        int add = backtrack(nums, target, index + 1, currentSum + nums[index]);
        int subtract = backtrack(nums, target, index + 1, currentSum - nums[index]);

        // Return the sum of both cases
        return add + subtract;
    }

    public static void main(String[] args) {
        TargetSum ts = new TargetSum();
        int[] nums = {1,1,1,1,1};
        int target = 3;
        System.out.println(ts.findTargetSumWays(nums, target)); // Output: 5
    }

//    public int findTargetSumWays(int[] nums, int target) {
//        int sum = 0;
//        int targetSum = 0;
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
////        if (sum == target) {
////            count++;
////        }
//
//        if (sum == target && nums.length == 1 || (-sum) == target && nums.length ==1) {
//            count++;
//        }
//
//
//        targetSum = sum;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                targetSum -= nums[i];
//                if (targetSum == target) {
//                    count += 1;
//                }
//            }
//            targetSum = sum;
//        }
//        return count;
//    }
}
