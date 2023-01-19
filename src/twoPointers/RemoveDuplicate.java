package src.twoPointers;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] arr = new int[]{1,1,1,2,5,5,8};

        int ans = removeDup(arr);
       for (int i = 0;i<ans;i++) {
           System.out.println(arr[i]);
       }
        System.out.println();
    }

    private static int removeDup(int[] arr) {

        int j =0;
        int n = arr.length;
       for (int i =0;i<n;i++){
            if (i < n-1 && arr[i] == arr[i+1]) {
               continue;
            }
            arr[j++] = arr[i];

        }

        return j;
    }
}
