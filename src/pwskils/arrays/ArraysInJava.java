package src.pwskils.arrays;

import java.util.Arrays;

public class ArraysInJava {

    // Diagonal  sum...
    public static int[][] solution(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {

                    // mark row as -1;
                    for (int j2 = 0; j2 < matrix[0].length; j2++) {
                        matrix[i][j2] = -1;
                    }

                    // mark column as -1;  
                    for (int i2 = 0; i2 < matrix.length; i2++) {
                        matrix[i2][j] = -1;
                    }
                    
                }
                
            }
            
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
                
            }
            
        }
        
        return matrix;
    }

    public static void main(String[] args) {
        // int A[][] = {{1,1,1},{1,0,1},{1,1,1}};
         int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] A = {{0,1}};
        int[][] ans = solution(A);
        System.out.println(Arrays.deepToString(ans));
    }
}
