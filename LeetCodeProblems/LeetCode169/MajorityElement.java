package LeetCodeProblems.LeetCode169;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majorityElement=nums[0];
        int count=0;
        for (int num : nums) {
            if (count == 0)
                majorityElement = num;
            if (num == majorityElement) {
                count++;
            } else {
                count--;
            }
        }
        return majorityElement;
    }
    public int majorityElement2(int[] nums) {
        int el=nums[0];
        int count=1;
        for(int i=1; i<nums.length;i++){
            if(nums[i]==el){
                count++;
            }
            else if(count==0){
                el=nums[i];
                count++;
            }
            else{
                count--;
            }
        }
        return el;
    }

}
