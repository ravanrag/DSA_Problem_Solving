package LeetCodeProblems.LeetCode56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] inter) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(inter , (a, b)->Integer.compare(a[0],b[0]));
        result.add(inter[0]);
        for(int i=1;i<inter.length;i++){
            int[] last = result.get(result.size()-1);
            if(last[1]<inter[i][0])
                result.add(inter[i]);
            else{
                result.remove(result.size()-1);
                last[1]=Math.max(last[1],inter[i][1]);
                result.add(last);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
