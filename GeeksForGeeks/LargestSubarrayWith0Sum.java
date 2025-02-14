package GeeksForGeeks;

import java.util.HashMap;
//https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
public class LargestSubarrayWith0Sum {
    public int maxLen(int arr[]) {
        // code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        int maxlen=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==0){
                maxlen=Math.max(maxlen,i+1);
            }
            else if(hm.containsKey(sum)){
                int pos = hm.get(sum);
                maxlen=Math.max(maxlen,i-pos);
            }
            else{
                hm.put(sum,i);
            }
        }
        return maxlen;
    }
}