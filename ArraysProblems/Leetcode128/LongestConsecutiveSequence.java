package ArraysProblems.Leetcode128;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Set<Integer> set = new HashSet<>();
        int longest=1;
        for(int i : nums)
            set.add(i);

        for(int i:nums){
            if(!set.contains(i-1)){
                int temp=i;
                int count=1;
                while(set.contains(temp+1)){
                    count++;
                    temp++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
