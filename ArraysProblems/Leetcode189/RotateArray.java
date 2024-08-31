package ArraysProblems.Leetcode189;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int j=nums.length;
        k=k%j;
        if(j>1){
            rotate(nums,0,j-1);
            rotate(nums,0,k-1);
            rotate(nums,k,j-1);
        }
    }
    public void rotate(int[] nums ,int i, int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j--;
            i++;
        }
    }
}
