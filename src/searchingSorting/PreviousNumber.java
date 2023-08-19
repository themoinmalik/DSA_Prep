package src.searchingSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreviousNumber {

    public static void main(String[] args) {

//        int[] a = new int[]{2, 5, 10, 12, 15};
//        int target = 8;
//
//        int ans  = checkPrevNum(a,target);
//        System.out.println(ans);


        List<Integer> list = Arrays.asList(1,3,45,6,1,4,4);

        for(int i : list) {

            i = i+1;
            System.out.println(i);


        }
    }

    private static int checkPrevNum(int[] a, int target) {

        int i = 0;
        int j = a.length-1;
        int prev = 0;
        int next = 0;


        while (i<=j) {

            int mid = (i+j)/2;

            if (a[mid] == target) {
                return target;
            }

            if (a[mid] > target) {
                next = a[mid];      // ceil...
                j = mid-1;
            } else {
                prev = a[mid];       // floor...
                i = mid+1;
            }
        }

       if (target-prev < next - target) {
           return prev;
       }
       return next;
    }
}
