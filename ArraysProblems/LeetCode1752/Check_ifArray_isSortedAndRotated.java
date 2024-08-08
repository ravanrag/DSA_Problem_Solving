package ArraysProblems.LeetCode1752;

public class Check_ifArray_isSortedAndRotated {
    public boolean check(int[] nums) {
        int fst=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>nums[(i+1)%nums.length])
                fst++;
        }
        if(fst>=2)
            return false;
        return true;
    }
}
