import java.util.Arrays;

public class Selection {
    public static void sort(Comparable[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < a.length; j++)
            {
                // under the worse circumstance, the arr is {6,5,4,3,2,1}
                // the comparasion time is: (n-1) + (n - 2) + ... + 1 = n(n-1) / 2
                // the exchange time is: n - 1
                // So the time complexity is O(n^2)
                if (greater(a[min], a[j]))
                {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    private static boolean greater(Comparable v, Comparable w)
    {
        return v.compareTo(w) > 0;
    }

    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
