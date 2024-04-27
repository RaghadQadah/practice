import java.util.HashMap;
import java.util.Map;

public class ransomNote
{
    public static void main(String[] args)
    {
        String ransomNote = "aa";
        String magazine =
                "aab";

        Map<Character, Integer> mapRansomNote = new HashMap<>();
        for (Character aInNum : ransomNote.toCharArray())
        {
            mapRansomNote.put(aInNum,
                    mapRansomNote.getOrDefault(aInNum, 0) + 1);
        }

        Map<Character, Integer> mapMagazine = new HashMap<>();
        for (Character aInNum : magazine.toCharArray())
        {
            mapMagazine.put(aInNum,
                    mapMagazine.getOrDefault(aInNum, 0) + 1);
        }

        System.out.println("magazine" + mapMagazine);
        System.out.println(mapRansomNote);
        Boolean isRansomNote = true;
        for (Map.Entry lEntry : mapRansomNote.entrySet())
        {

            if (mapMagazine.get(lEntry.getKey()) == null ||
                    mapMagazine.get(lEntry.getKey()) <
                            (int) lEntry.getValue())
            {
                isRansomNote = false;
            }

        }
        System.out.println(isRansomNote);
    }
}
