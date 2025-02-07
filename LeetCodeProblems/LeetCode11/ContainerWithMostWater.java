package LeetCodeProblems.LeetCode11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left=0, right = height.length-1;
        int max=0;
        while (left<right) {
            int tempMax = Math.min(height[right], height[left]);
            max = Math.max((right - left) * tempMax, max);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}
