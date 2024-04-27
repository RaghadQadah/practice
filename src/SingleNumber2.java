import java.util.*;

public class SingleNumber2 {

    public static void main(String[] args) {
        int[] nums = {3, 3, 2, 3};
//        int[] nums = {0, 1, 0, 99, 0, 1, 1};
        /**
         Map<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < nums.length; i++) {

         map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
         }
         System.out.println(map.toString());
         **/


        /**
         *  3 = 0 1 1
         *  2 = 0 1 0
         *  3 = 0 1 1
         *  3 = 0 1 1
         *  -----------
         *         4 3
         *         % 3
         *   ----------
         *         1 0
         */

        int ans = 0;
        for (int i = 0; i < 32; ++i) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j] >> i & 1; // check i bits if one or not
            }
            sum %= 3;
            ans = ans | sum << i;
        }
        System.out.println(ans);
    }
}