package ArraysProblems.Leetcode31;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind>=0)
        {
            for(int i=nums.length-1; i>=0; i--){
                if(nums[i]>nums[ind]){
                    swap(nums, i, ind);
                    break;
                }
            }
        }
        reverse(nums, ind+1, nums.length-1);
    }
    public void reverse(int[] a, int i, int j){
        while(i<j){
            swap(a,i,j);
            i++;
            j--;
        }
    }
    public void swap(int[] a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
