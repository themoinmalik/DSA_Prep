package src;

import java.lang.*;


class Test
{
    static int minChanges(int[] A, int n)
    {
        int cnt = 0;

        for (int i = 0; i < n - 2; ++i)
        {
            if ((i - 1 >= 0) && A[i - 1] == 1 &&
                    A[i + 1] == 1 &&
                    A[i] == 0)
            {
                A[i + 1] = 0;
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args)
    {
        int[] A = { 1, 1, 0, 1, 1, 0, 1, 0, 1, 0 };
        int n = A.length;

        System.out.print(minChanges(A, n));
    }
}