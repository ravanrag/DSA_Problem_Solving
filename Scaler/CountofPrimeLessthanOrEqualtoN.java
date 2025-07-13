package Scaler;

public class CountofPrimeLessthanOrEqualtoN {
    public int solve(int A) {
        if(A==1) return 0;
        int count=0;
        for(int i=2;i<=A;i++){
            count+=isPrime(i);
        }
        return count;
    }
    public int isPrime(int N){
        if (N<4) return 1;
        for(int i=2; i*i<=N;i++){
            if(N % i==0)
                return 0;
        }
        return 1;
    }
}
