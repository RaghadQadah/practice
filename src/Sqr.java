public class Sqr
{
    public static void main(String[] args)
    {
        long x = 1;
        long end = x/2;
        long start = 0;
        int sqr = 0;
//        if (x > 0 && x < 4)
//        {
//            sqr = 1;
//        }
//        for (int i = 4; i < x / 2; i++)
//        {
//            start = i * i;
//            end = i + 1;
//            end *= end;
//            if (x >= start && x <= end)
//            {
//                sqr = i;
//            }
//        }
//        System.out.println(sqr);
        while (start <= end)
        {
            long mid = (start + end) / 2;
            if (mid * mid == x)
            {
                //return mid;
                System.out.println(mid);
                break;
            }
            else if (mid * mid > x)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        System.out.println(end);
    }


}


