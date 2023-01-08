package src.SlidingWindows;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeNumInSubArray {

    public static void main(String[] args) {
        int[] arr = new int[]{10, -1, -5, 7, -15, 20, 18, 24};
        int windSize = 3;
        List<Integer> ans = findNegNumber(arr, windSize);
        System.out.println(ans);

    }

    private static List<Integer> findNegNumber(int[] arr, int windSize) {

        int i=0, j = 0;

        List<Integer> list = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();
        while (j< arr.length) {

            if (arr[j]<0) {
               q.add(arr[j]);
            }
            if (j-i+1 < windSize) {
                j++;
            }
            else if (j-i+1 == windSize) {

                if (q.isEmpty()) {
                    list.add(0);
                } else {
                    int num = q.peek();
                    list.add(num);
                    if (num == arr[i])
                       q.remove();
                }
                i++;
                j++;
            }
        }

        return list;
    }

}
