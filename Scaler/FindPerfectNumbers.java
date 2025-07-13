package Scaler;
/*You are given an integer A. You have to tell whether it is a perfect number or not.
Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
A proper divisor of a natural number is the divisor that is strictly less than the number.*/
//Problem Constraints
//1 <= A <= 106

//Input Format
//First and only argument contains a single positive integer A.
//
//Output Format
//Return 1 if A is a perfect number and 0 otherwise.

//Examples
//Example 1:
//        For A = 4, the sum of its proper divisors = 1 + 2 = 3, is not equal to 4.
//Example 2:
//        For A = 6, the sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.
//Example 3:
//        For A = 3, the sum of its proper divisors = 1, is not equal to 3.

public class FindPerfectNumbers {
    public int solve(int A) {
        if(A<4) return 0;
        int sum=1;
        for(int i=2;i*i<=A;i++){
            if(A%i==0){
                sum=sum+i+(A/i);
                if(i*i==A)
                    sum-=i;
            }
        }
        if(sum==A)
            return 1;
        return 0;
    }
}