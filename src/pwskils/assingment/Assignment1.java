package src.pwskils.assingment;

import java.util.Arrays;

public class Assignment1 {

    public static int[] solution(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != i+1 ) {
                return new int[]{arr[i], i+1};

            }
            
        }
        
        return arr;

    }

    public static void main(String[] args) {

        int[] arr = new int[] { 1,2,3,4,5,6,7,8,9};

        int[] ans = solution(arr);
        System.out.println(Arrays.toString(ans));

    }

}