package ArraysProblems.LeetCode26;

public class RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int j=1;
        int min=nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
