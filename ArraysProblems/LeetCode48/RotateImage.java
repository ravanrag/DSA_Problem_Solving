package ArraysProblems.LeetCode48;

public class RotateImage {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for (int[] ints : matrix) {
            reverse(ints);
        }
    }
    public void transpose(int[][] matrix){
        for(int i=0; i<matrix.length-1;i++){
            for(int j=i+1; j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public void reverse(int[] matrix){
        int j=matrix.length-1;
        for( int i=0;i<j;i++){
            int temp = matrix[i];
            matrix[i]=matrix[j];
            matrix[j]=temp;
            j--;
        }
    }
}
