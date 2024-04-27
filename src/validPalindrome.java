public class validPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        StringBuilder stringBuilder = new StringBuilder();
        int val;
        for (int i = 0; i < s.length(); i++) {
            val = Integer.valueOf(s.charAt(i));
            if ((val >= 65 && val <= 90) || (val >= 97 && val <= 122) || (val >= 48 && val <= 57)) {
                System.out.println(s.charAt(i));
                stringBuilder.append(s.charAt(i));
            }
        }
        System.out.println(stringBuilder);
        String orig = stringBuilder.toString().toLowerCase();
        String rev = stringBuilder.reverse().toString().toLowerCase();
        System.out.println(rev.equals(orig));
    }
}
