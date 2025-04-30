package LeetCodeProblems.Leetcode912;
public class SortAnArray {
    public int[] sortArray(int[] nums) {
        for(int i=0; i<nums.length-1;i++){
            int minimum_index = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minimum_index]>nums[j]){
                    minimum_index=j;
                }
            }
            swap(nums,i,minimum_index);
        }
        return nums;
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
