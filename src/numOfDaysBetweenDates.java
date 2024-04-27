import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class numOfDaysBetweenDates {
  public static void main(String[] args) {

    String date1 = "2100-9-22";
    String date2 = "1991-3-12";

    // refrence date is 01-01-1970

    int[] d1 = Arrays.stream(date1.split("-")).mapToInt(Integer::valueOf).toArray();
    int[] d2 = Arrays.stream(date2.split("-")).mapToInt(Integer::valueOf).toArray();

    System.out.println("\n" + (totalDays(d1) - totalDays(d2)));
  }

  public static int daysInMonth(int year, int month) {
    if (month == 2) {
      return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
      return 30;
    } else {
      return 31;
    }
  }

  public static int totalDays(int[] date) {
    int years = Math.abs(date[0] - 1970);
    int monthes = Math.abs(date[1] - 1);
    int days = Math.abs(date[2] - 1);

    int numOfLeap = 0;
    for (int i = 1970; i < date[0]; i++) {
      if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) numOfLeap++;
    }
    int daysInMonth = 0;
    for (int i = 1; i <= monthes; i++) {
      daysInMonth += daysInMonth(date[0], i);
    }

    // totalDays = days + monthes * 30 + (years - numOfLeap) * 365 + numOfLeap * 366;
    int totalDays = days + daysInMonth + (years - numOfLeap) * 365 + numOfLeap * 366;

    //    System.out.println(d1[0] + " " + d1[1] + " " + d1[2]);
    System.out.println(date[0] + " " + date[1] + " " + date[2]);
    System.out.println(years + " " + monthes + " " + days);
    System.out.println(numOfLeap);
    System.out.println(totalDays);

    return totalDays;
  }
}
