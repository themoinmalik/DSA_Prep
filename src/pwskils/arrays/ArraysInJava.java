package src.pwskils.arrays;

import java.util.Arrays;

public class ArraysInJava {


    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int[][] ans = solution(arr);
        System.out.println(Arrays.deepToString(ans));
    }

    // Diagnal  summ.. .

    public static int[][] solution(int[][] arr) {

        // transpose... 

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                swap(arr[j][i],arr[i][j]);        
            }
            
        }
        
        return arr;
    }


    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
