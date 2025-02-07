package LeetCodeProblems.Leetcode167;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int left=0, right=numbers.length -1;
        while(left<right){
            int currSum=numbers[left]+numbers[right];
            if(currSum>target)
                right--;
            else if(currSum<target)
                left++;
            else
                break;
        }
        return new int[]{left+1,right+1};
    }
}
