package Scaler;

public class ReverseARangeInAnArray {
    public static int[] solve(int[] A, int B, int C) {
        while (B<C){
            int temp=A[B];
            A[B]=A[C];
            A[C]=temp;
            B++;
            C--;
        }
        return A;
    }
}
