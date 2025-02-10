package LeetCodeProblems.LeetCode16;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum>=target)
                    right--;
                else
                    left++;
                if(Math.abs(result-target)>Math.abs(sum-target))
                    result=sum;
            }
        }
        return result;
    }
}
