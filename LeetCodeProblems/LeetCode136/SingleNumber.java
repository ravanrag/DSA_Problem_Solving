package LeetCodeProblems.LeetCode136;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int a : nums){
            ans=ans^a;
        }
        return ans;
    }
}
