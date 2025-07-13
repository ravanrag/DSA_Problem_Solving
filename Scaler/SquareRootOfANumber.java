package Scaler;

public class SquareRootOfANumber {
        public int solve(int A) {
            for(int i=0; i*i<=A;i++){
                if(i*i==A)
                    return i;
            }
            return -1;
        }
}
