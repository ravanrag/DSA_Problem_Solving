package Scaler;

public class ArrayRotation {
    public int[] RottateArray(int[] A, int B) {
//        B is the number of placed the elements are rotated
//        if B is larger than the size of the array the get the remainder
//        EX : A=5 and B=14
//        then every 5 time the array is rotated by one value it will be the original array
//        so after 10 rotations the array will be same
//        now we need to rotate the array only 4 more time that will have a change in the array
        B = B % A.length;
        ReverseAnArray.reverseAnArray(A);
        ReverseARangeInAnArray.solve(A,0,B-1);
        ReverseARangeInAnArray.solve(A,B,A.length-1);
        return A;
    }
}
