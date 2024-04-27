import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

public class HappyNumber
{
    public static void main(String[] args)
    {
        int n = 19;
        int sum = squareSumDigits(n);
        List<Integer> lList = new ArrayList<>();
        while (n < pow(2, 31))
        {
            n = sum;
            sum = squareSumDigits(n);
            if (sum == 1)
            {
                System.out.println("TRUE");
                break;
            }
            else if (lList.contains(sum))
            {
                System.out.println("FALSE");
                break;
            }
            lList.add(sum);
        }
    }
    

    static int squareSumDigits(int x)
    {
        int d;
        int sum = 0;
        while (x > 0)
        {
            d = (x % 10);
            sum += pow(d, 2);
            x = x / 10;
        }

        return sum;
    }

}
