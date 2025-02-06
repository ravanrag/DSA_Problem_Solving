package ArraysProblems.LeetCode5;

public class Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1){    return "";   }
        String result="";
        int length=0;
        for(int i=0; i<s.length();i++){
//          searching for odd length palindrome.
            int left=i, right=i;
            while(left>=0 && right <s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1 >length){
                    result=s.substring(left, right+1);
                    length =right-left+1;
                }
                left--;
                right++;
            }
//          searching for Even length palindrome
            left=i;
            right=i+1;
            while(left>=0 && right <s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1 >length){
                    result=s.substring(left, right+1);
                    length =right-left+1;
                }
                left--;
                right++;
            }
        }
        return result;
    }
}
