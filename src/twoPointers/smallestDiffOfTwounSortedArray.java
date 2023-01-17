package src.twoPointers;

import java.util.Arrays;

public class smallestDiffOfTwounSortedArray {

    public static void main(String[] args) {

//        Input: [1, 3, 15, 11, 2], [23, 127, 235, 19, 8]
//
//        Output: [11, 8]; this pair has the smallest difference.


        int[] a1 = new  int[]{1, 3, 15, 11, 2};
        int[] a2 = new int[]{23, 127, 235, 19, 8};

        int[] ans = checkSmallestDiff(a1,a2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] checkSmallestDiff(int[] a1, int[] a2) {

        Arrays.sort(a1);
        Arrays.sort(a2);

        double smallestDiff = Double.MAX_VALUE;

        int[] smallestDiffInd = new int[2];

        int i=0;
        int j = 0;

        while (i<a1.length  && j<a2.length) {
            int currentDiff = Math.abs(a1[i]-a2[j]);

            if (currentDiff < smallestDiff) {
                smallestDiff = currentDiff;
                smallestDiffInd[0] = a1[i];
                smallestDiffInd[1] = a2[j];
            }
            if (a1[i]<a2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return new int[]{smallestDiffInd[0],smallestDiffInd[1]};
    }

}
