package LeetCodeProblems.LeetCode1;

import java.util.HashMap;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int diff=target-nums[i];
            if(hm.containsKey(diff))
                return new int[]{hm.get(diff),i};
            hm.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
