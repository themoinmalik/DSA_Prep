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

        int[][] matrix = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                matrix[i][j] = arr[j][i];
            }
            //reverse the row; HEllo@prityam can you pls approve this mr.
        }

        return matrix;
    }
}
