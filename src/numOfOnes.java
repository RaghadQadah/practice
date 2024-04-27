public class numOfOnes {
    public static void main(String[] args) {
        int n = 000000000000000000000000100001111;
        String s = Integer.toBinaryString(n);
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                c++;
            }
        }
        System.out.println(c);
    }
}
