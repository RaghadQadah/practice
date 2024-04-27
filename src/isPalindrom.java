public class isPalindrom {
    public static void main(String[] args) {
        int x = 121;
        int num = x;
        int d = 0;
        int rev = 0;
        while (x > 0) {
            d = (x % 10);
            rev = rev * 10 + d;
            x = x / 10;
        }
        System.out.println(rev == num);
    }
}

