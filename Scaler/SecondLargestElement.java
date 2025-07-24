package Scaler;

public class SecondLargestElement {
    public int solve(int[] A) {
        if(A.length<2)
            return -1;
        int max=A[0];
        int sec=-1;
        for(int i=1;i<A.length;i++){
            if(max<A[i]){
                sec=max;
                max=A[i];
            }
            else if(sec<A[i] && A[i]<max){
                sec=A[i];
            }
        }
        return sec;
    }
}

