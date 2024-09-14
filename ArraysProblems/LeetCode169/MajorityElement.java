package ArraysProblems.LeetCode169;

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
}
