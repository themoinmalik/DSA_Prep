package src.SlidingWindows;

import java.util.Comparator;
import java.util.PriorityQueue;

public class maxOfSubArray {

    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3; // win_size

        int[] ans = checkMaxOfSubArray(a, k);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    private static int[] checkMaxOfSubArray(int[] a, int k) {

        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        int i = 0;
        int n = a.length;
        int ind = 0;
        int[] maxarr = new int[n - k + 1];
        int max_num = 0;
        for (int j = 0; j < n; j++) {
            q.add(a[j]);
            if (j - i + 1 == k) {
                max_num = q.peek();
                maxarr[ind++] = max_num;
                if (max_num == a[i]) {
                    q.remove();
                }
                i++;
            }
        }

        return maxarr;
    }
}
