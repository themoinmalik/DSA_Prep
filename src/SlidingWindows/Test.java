package src.SlidingWindows;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        int[] in = new int[]{2,3,4,5,6,7,8,9};
        int t = 8;

        int[] ans = checkAns(in,t);
//        for (int k =0;k<ans.length-1;k++) {
//            System.out.println(Arrays.toString(ans));
//        }

        System.out.println(Arrays.toString(ans));
    }

    public static  int[] checkAns(int[] in, int t) {


        int i=0;
        int sum = 0;
        int j=in.length-1;
        while ( j>i) {
            sum = in[i]+in[j];

            if ( sum > t) {
                j--;
            }

            if (sum < t) {
                i++;
            }

            if (sum == t) {
                return new int[]{i,j};
            }

        }

        return null;

    }


}
