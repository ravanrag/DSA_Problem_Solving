package Scaler;

public class IsPrime {
    public int solve(int A) {
        if(A<2) return 0;
        for(int i=2;i*i<=A;i++){
            if(A%i==0)
                return 0;
        }
        return 1;
    }
}
