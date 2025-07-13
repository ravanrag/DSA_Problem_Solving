package Scaler;

public class CountFactors2 {
    public int solve(int A) {
        if(A==1)
            return 1;
        int count =0;
        for(int i=1; i*i<=A;i++){
            if(A%i==0)
                count+=2;
            if(i*i==A)
                count--;
        }
        return count;
    }
}
