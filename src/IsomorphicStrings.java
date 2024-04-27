import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings
{
    public static void main(String[] args)
    {
        String s = "baba";
        String t = "badc";
        Map<Character, Character> sTot = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();


        for (int i = 0; i < s.length(); i++)
        {
            if ((sTot.containsKey(s.charAt(i)) &&
                    sTot.get(s.charAt(i)) != t.charAt(i)) ||
                    (tToS.containsKey(t.charAt(i)) &&
                            tToS.get(t.charAt(i)) != s.charAt(i)))
            {
//                return false;
                System.out.println("FALSE");
            }
            else
            {
                sTot.put(s.charAt(i), t.charAt(i));
                tToS.put(t.charAt(i), s.charAt(i));
            }
        }
        System.out.println(sTot.toString());
        System.out.println(tToS.toString());

    }


}
