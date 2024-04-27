import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElement
{
    public static void main(String[] args)
    {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        Map<Integer, Integer> map = new HashMap<>();
        for (int aInNum : nums)
        {
            map.put(aInNum, map.getOrDefault(aInNum, 0) + 1);
        }
        Integer maxValueInMap = (Collections.max(map.values()));
        Integer Majorty = map.get(0);

        //System.out.println((maxValueInMap));
        for (Map.Entry lEntry : map.entrySet())
        {
            if (lEntry.getValue() == maxValueInMap)
            {
                Majorty = (Integer) lEntry.getKey();
            }
        }
       // System.out.println(Majorty);
    }
}

