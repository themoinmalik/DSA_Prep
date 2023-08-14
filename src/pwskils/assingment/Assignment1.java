package src.pwskils.assingment;

import java.util.Arrays;
import java.util.HashMap;

public class Assignment1 {
    public static int[] solution(int[] arr) {

        // cyclic sort....

        int i = 0;

        while (i<arr.length) {
            int correct = arr[i]-1;    // correct = arr[0]  if array start with 0;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            }else {
                i++;
            }
        }
        return arr;

    }

    public static void swap(int[] arr, int i, int c) {

        int temp = arr[i];
        arr[i] = arr[c];
        arr[c] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 7, 1, 2};
        int t = 2;
        int[] ans = solution(arr);
        System.out.println(Arrays.toString(ans));
    }
}