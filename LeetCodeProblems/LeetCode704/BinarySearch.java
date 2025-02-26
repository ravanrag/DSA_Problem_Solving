package LeetCodeProblems.LeetCode704;

public class BinarySearch {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }
    public int search (int[] nums, int target, int low, int high){
        if(low>high)
            return -1;
        int mid = (high+low)/2;
        if(nums[mid]==target)
            return mid;
        else if(nums[mid]<=target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
        return search(nums, target, low, high);
    }
}
