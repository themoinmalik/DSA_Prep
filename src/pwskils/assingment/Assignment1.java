package src.pwskils.assingment;

import java.util.HashMap;

public class Assignment1 {
    public static int solution(int[] arr) {

        // cyclic sort....

        for (int i = 0; i < arr.length; i++) {

            if (i != arr[i]-1) {
                //swap.. arr[i] , arr[i]-1;
            }

        }


    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int t = 2;
        int ans = solution(arr);
        System.out.println(ans);    
    }
}