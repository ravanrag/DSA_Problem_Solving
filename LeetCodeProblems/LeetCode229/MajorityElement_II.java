package LeetCodeProblems.LeetCode229;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement_II {
    public List<Integer> majorityElement(int[] nums) {
        int el1=0, el2=0;
        int count1=0,count2=0;
        for(int i=0; i<nums.length;i++){
            if(count1==0 && el2!=nums[i]){
                el1=nums[i];
                count1++;
            }
            else if(count2==0 && el1!=nums[i]){
                el2=nums[i];
                count2++;
            }
            else if(el1==nums[i])
                count1++;
            else if(el2==nums[i])
                count2++;
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> li = new ArrayList<>();
        count1=0;
        count2=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==el1)
                count1++;
            else if(nums[i]==el2)
                count2++;
        }
        int n=nums.length;
        if(count1>n/3)
            li.add(el1);
        if(count2>n/3)
            li.add(el2);
        return li;
    }
}
