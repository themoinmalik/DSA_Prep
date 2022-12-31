package src.arrays1D;

import java.util.Arrays;
import java.util.HashMap;


public class TwoSum {

    public static void main(String[] args) {

        int[] arr = new int[]{2,9,7,11,15};
        int target = 13;

        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));

    }

//    private static int[] twoSum(int[] arr, int target) {
//        for (int i=0;i<arr.length;i++) {
//            for (int j=i+1; j<arr.length;j++) {
//                int sum = arr[i] + arr[j];
//                if (sum == target) {
//                    return new int[]{i,j};
//                }
//            }
//        }
//
//        return null;
//    }


    private static int[] twoSum(int[] arr, int target) {

        // creating Hashmap
        HashMap<Integer,Integer> map = new HashMap<>();

        // filling HP
        for (int i =0; i<arr.length; i++) {
            map.put(arr[i],i);  // arrays values...
        }

        // checking values.
        for (int i=0; i<arr.length;i++) {
            int rem = target - arr[i];

            if (map.containsKey(rem)) {
                int index = map.get(rem);
                return new int[]{i,index};
            }
        }

        return null;

    }
}
