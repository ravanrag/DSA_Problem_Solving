package GeeksForGeeks;

public class LongestSubarraywithSumK {
    public int longestSubarray(int[] a, int k) {
        int left=0, right=0;
        int sum=a[0];
        int maxLength=0;
        int n=a.length;
        while(right<n ){
            if(sum==k){
                maxLength=Math.max(maxLength,right-left+1);
            }
            while(left <=right && sum>k){
                sum=sum-a[left];
                left++;
            }
            right++;
            if(right<n){
                sum+=a[right];
            }
        }
        return maxLength;
    }
}
