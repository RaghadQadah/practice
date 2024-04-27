import java.util.Arrays;

public class checkIfTwoStringArraysAreEq {
  public static void main(String[] args) {
    String[] word1 = {"ab", "c"};
    String[] word2 = {"a", "bc"};
    StringBuffer w1 = new StringBuffer();
    StringBuffer w2 = new StringBuffer();
    Arrays.stream(word1).forEach(s -> w1.append(s));
    Arrays.stream(word2).forEach(s -> w2.append(s));
    System.out.println((w1.toString()).equals(w2.toString()));
  }
}
