package ArraysProblems.LeetCode283;

public class MoveZeros {
    public void moveZeroes(int[] nums) {

        for(int i=0; i<nums.length-1;i++){
            int j=i+1;
            while (nums[i]==0 && j<nums.length ){
                swap(nums, i,j);
                j++;
            }
        }
    }
    public void swap(int[] nums, int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
