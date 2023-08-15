package src.pwskils.assingment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment1 {

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