package Scaler;
//Given an array A of N integers.
//Count the number of elements that have at least 1 elements greater than itself.
//A = [3, 1, 2], The elements that have at least 1 element greater than itself are 1 and 2

public class CountofElements {
    public int solve(int[] A) {
        int n=A.length;
        int max=A[0];
        int freq=1;
        for(int i=1; i<n; i++){
            if(A[i]>max){
                max=A[i];
                freq=1;
            }
            else if(A[i]==max){
                freq++;
            }
        }
        return n-freq;
    }
}
