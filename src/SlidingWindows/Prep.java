package src.SlidingWindows;

import java.util.Arrays;

public class Prep {

    public static int[] solution(int[][] matrix) {
        //
        int count = 0;
        int[] arr = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            arr[i] = count;
            count = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] mat  = 
      {{1,1,0,0,0},
      {1,1,1,1,0},
      {1,0,0,0,0},
      {1,1,0,0,0},
      {1,1,1,1,1}};
        int[] ans = solution(mat);
        System.out.println(Arrays.toString(ans));
    }

}
