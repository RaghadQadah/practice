import java.util.ArrayList;
import java.util.Arrays;

public class legthOfLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        String[] arrayOfWords = s.split(" ");
        System.out.println(arrayOfWords[arrayOfWords.length - 1]);
        System.out.println(arrayOfWords[arrayOfWords.length - 1].length());
    }
}
