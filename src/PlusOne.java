import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne
{
    public static void main(String[] args)
    {
        int digits[] = {9, 9};
        List<Integer> lList = new ArrayList<>(digits.length);
        Arrays.stream(digits).forEach(lList::add);
        int inc = 0;
        for (int i = digits.length - 1; i >= 0; i--)
        {
            inc = digits[i] + 1;
            if (inc == 10)
            {
                lList.set(i, 0);
                if (i == 0)
                {
                    lList.add(i, 1);
                }
            }
            else
            {
                lList.set(i, inc);
                break;
            }
        }
        int[] x = lList.stream().mapToInt(value -> value).toArray();
        System.out.println(lList.toArray());

    }


    /**
     *              int[] res = new int[digits.length + 1];
     *             System.arraycopy(digits, 0, res, 0, digits.length);
     *             res[res.length - 1] = 0;
     *             res[res.length - 2] = 1;
     *             System.out.println(Arrays.toString(res));
     */
}
