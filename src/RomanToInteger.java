import java.util.HashMap;
import java.util.Map;

public class RomanToInteger
{
    public static void main(String[] args)
    {
        String s = "MCMXCIV";
        Map<Character, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        map2.put("IV", 4);
        map2.put("IX", 9);
        map2.put("XL", 40);
        map2.put("XC", 90);
        map2.put("CD", 400);
        map2.put("CM", 900);

        Integer sum = 0;
        for (String sub : map2.keySet())
        {
            if (s.contains(sub))
            {
                sum += map2.get(sub);
                s = s.replace(sub, "");
            }
        }
        for (char c : s.toCharArray())
        {
            sum += map.get(c);
        }
        System.out.println(sum);

    }
}
