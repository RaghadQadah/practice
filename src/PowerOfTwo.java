public class PowerOfTwo {
  public static void main(String[] args) {

    int x = 536870912;

    System.out.println((Math.log10(x) / Math.log10(2)));
    System.out.println((int) (Math.log10(x) / Math.log10(2)) == (Math.log10(x) / Math.log10(2)));
  }
}
