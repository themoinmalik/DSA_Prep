package src.pwskils.arrays;

import java.util.Arrays;

public class ArraysInJava {

    // diagnol  summ.. . 

    public static int solution(int[][] arr,int k) {

        int sum = 0;
        int n = arr.length-1;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (i==j) {
                    sum = sum + arr[i][j];   
                }
                if (j == arr.length - 1-i) {
                    sum = sum + arr[i][j]; 
                } 
            }
            
        }

        if (arr.length%2 != 0) {
            sum = sum - arr[n/2][n/2];
        }
        return sum;
 
       
    }
    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int  k = 1;
        
        int ans = solution(arr, k);
        System.out.println(ans);

    }
}
