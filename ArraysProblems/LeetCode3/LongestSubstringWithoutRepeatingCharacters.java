package ArraysProblems.LeetCode3;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        char[] StrIndex = s.toCharArray();
        int left=0, right=0, maxLength=0;
        HashMap <Character, Integer> charPosition = new HashMap<>();
        while(right<s.length()){
            char currentChar =StrIndex[right];
            if(charPosition.containsKey(currentChar) &&  charPosition.get(currentChar) >=left)
            {
                left=charPosition.get(currentChar)+1;
            }
            maxLength=Math.max(maxLength, right-left+1);
            charPosition.put(StrIndex[right],right);
            right++;
        }
        return maxLength;
    }
}
