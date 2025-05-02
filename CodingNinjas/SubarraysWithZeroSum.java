package CodingNinjas;

import java.util.HashMap;

public class SubarraysWithZeroSum {
    public static int countSubarrays(int n, int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int count=0;
        int prefixsum=0;
        for(int i: arr){
            prefixsum+=i;
            if ( hm.containsKey(prefixsum)){
                count+=hm.get(prefixsum);
                hm.put(prefixsum,count+1);
            }
            else
                hm.put(prefixsum,1);
        }
        return count;
    }
}
