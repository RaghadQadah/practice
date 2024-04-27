import java.util.HashMap;

public class ContainsDuplicates
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean containsDup = false;
//        for (int i = 0; i < nums.length; i++)
//        {
//            for (int j = i + 1; j < nums.length; j++)
//            {
//                if (nums[i] == nums[j] && Math.abs(i - j) <= k)
//                {
//                    containsDup = true;
//                }
//            }
//
//        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(nums[i]) &&
                    (Math.abs(i - (int) map.get(nums[i])) <= k))
            {
                containsDup = true;
            }
            else
            {
                map.put(nums[i], i);
            }
        }

        System.out.println(containsDup);
    }
}
