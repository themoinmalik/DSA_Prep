package src.searchingSorting;

import java.util.Arrays;

public class FindMinInRotatedArray {

    public static void main(String[] args) {

        int[] a = new int[]{5, 7, 9, 2, 3};

        // Find min of the array...

        int ans = checkMin(a);
        System.out.println(ans);
    }

    private static int checkMin(int[] a) {

        int i =0;
        int j = a.length-1;
        int min = Integer.MAX_VALUE;
        int mid = 0;

        while (i<=j) {

            mid = (i+j)/2;

            if (a[mid] < a[mid+1] && a[mid] < a[mid-1]) {
                min = a[mid];      // number of times array is rotated ->  min = mid;
                return min;
            }

            if (a[mid] > a[mid+1]) {
                i = mid+1;
            } else {
                j = mid-1;
            }
        }
        return min;
    }

    public static class CyclicSort {

        public static int[] sort(int[] arr) {

            // cyclic sort.... Algo.
            // find the missing ...  where n = length and last element also ?
            // find all number disappear in an Array... ?
            // find the duplicates.... ?


            // sorting using cyclic sort.

            int i = 0;
            int n = arr.length;

            while (i<n ) {
                int correct = arr[i]-1;    // correct = arr[i]  if array start with 0;  //
                if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correct] ) {   // changes required acc to ques.. .
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                }else {
                    i++;
                }
            }

            return arr;

    //        List<Integer> list = new ArrayList<>();

            // search the element....
    //        for (int j = 0; j < n; j++) {
    //            if (arr[j] !=  j+1) {    // changes with respect to requerement ...
    //                return j+1;
    //            }
    //        }
    //        return n;
        }

        public static void main(String[] args) {
            int[] arr = {7,8,9,11,12};   // find the missing ....
            int[] ans = sort(arr);
    //        int ans = sort(arr);
            System.out.println(Arrays.toString(ans));
        }
    }
}
