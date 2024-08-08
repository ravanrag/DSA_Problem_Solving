package ArraysProblems.LeetCode73;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZero {
    public void setZeroes(int[][] matrix) {
        int[] n= new int[matrix.length];
        int[] m= new int[matrix[0].length];
        for(int i=0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    n[i] = 1;
                    m[j] = 1;
                }
            }
        }
List<List<Integer>> r = new ArrayList<>();
        for(int i=0; i<n.length; i++){
            for(int j=0; j<m.length; j++){
                if(n[i]==1 || m[j]==1){
                    matrix[i][j] = 0;
                }
            }
        }

    }

}
