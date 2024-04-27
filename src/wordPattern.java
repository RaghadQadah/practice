import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class wordPattern
{
    public static void main(String[] args)
    {

        String pattern = "abba";
        String s = "dog dog dog dog";
        String[] lSplit = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if (pattern.length() != lSplit.length)
        {
            System.out.println("false");
        }
        for (int i = 0; i < pattern.length(); i++)
        {
            if ((map.containsKey(pattern.charAt(i))) &&
                    !(map.get(pattern.charAt(i)).equals(lSplit[i])))
            {
                System.out.println("false");
            }
            if ((map.containsValue(lSplit[i]) &&
                    (getValueByKey(map, lSplit[i]) != (
                            pattern.charAt(i)))))
            {
                System.out.println("false");
            }
            map.put(pattern.charAt(i), lSplit[i]);
        }
        System.out.println(map);
    }

    public static Character getValueByKey(HashMap<Character, String> map,
            String val)
    {
        Character c = ' ';
        for (Map.Entry lEntry : map.entrySet())
        {
            if (lEntry.getValue().equals(val))
            {
                c = (Character) lEntry.getKey();
            }
        }
        return c;
    }
}
