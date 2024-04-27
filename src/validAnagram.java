import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class validAnagram
{
    public static void main(String[] args)
    {
        String s = "anagram";
        String t = "nagaramt";
//        List<Character> ListS =
//                s.chars().mapToObj(x -> (char) x).toList();
//        List<Character> ListT =
//                t.chars().mapToObj(x -> (char) x).toList();
//        boolean isValidAnagram = true;
//
//        for (Character Char : ListS)
//        {
//            if (!ListT.contains(Char))
//            {
//                isValidAnagram = false;
//            }
//
//        }

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (Character Char : s.toCharArray())
        {
            mapS.put(Char, mapS.getOrDefault(Char, 0) + 1);
        }
        for (Character Char : t.toCharArray())
        {
            mapT.put(Char, mapT.getOrDefault(Char, 0) + 1);
        }

        System.out.println(mapT);
        System.out.println(mapT);
        System.out.println(mapT.equals(mapS));
    }
}
