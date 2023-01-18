package src.SlidingWindows;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {


        int[] arr = new int[]{-5,1,2,-6,9};
        int k = 2;

        int[] ans = checkAns(arr,k);
        System.out.println(Arrays.toString(ans));


    }

    public static int[] checkAns(int[] arr, int k) {

        int[] negNum = new int[arr.length - k + 1];
        int ind = 0;
        int i = 0;

        for (int j = 0;j<arr.length;j++) {

            if (j-i+1 == k) {

                if (arr[i] < 0) {
                    negNum[ind++] = arr[i];
                }
                if (arr[j] < 0) {
                    negNum[ind++] =  arr[j];
                }
                i++;

            }

        }

        return negNum;

    }
}
