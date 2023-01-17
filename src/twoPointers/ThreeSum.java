package src.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    public static void main(String[] args) {

//        Input array: [7, 12, 3, 1, 2, -6, 5, -8, 6]
//        Target sum: 0
//
//        Output: [[2, -8, 6], [3, 5, -8], [1, -6, 5]]

        int[] a = new int[]{7, 12, 3, 1, 2, -6, 5, -8, 6};
        int target = 0;

        List<Integer[]> ans = chekcThreeSum(a,target);


        for (Integer[] el : ans) {
            System.out.print("[");
            for (Integer e: el) {
                System.out.print(e+",");
            }
            System.out.print("]");
        }
    }

    private static List<Integer[]> chekcThreeSum(int[] a, int target) {

        List<Integer[]> ans = new ArrayList<>();

        Arrays.sort(a);

        int i = 0;
        int left = i+1;
        int right = a.length-1;
        int sum = 0;

        for (i=0;i<a.length;i++) {



            while (left < right) {

                sum = a[i] + a[left] + a[right];

                if (sum == target) {
                    ans.add(new Integer[]{a[i] ,a[left] , a[right]});

                    left++;
                    right--;
                }
                if (sum > target) {
                    right--;
                }
                if (sum  < target) {
                    left++;
                }
            }
        }

        return ans;

    }


}
