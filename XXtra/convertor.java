package XXtra;

import java.util.List;

public class convertor {
    public int[][] convertTointArray(List<List<Integer>> arr) {
        int[][] res = new int[arr.size()][];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i).stream().mapToInt(Integer::intValue).toArray();
        }
        return res;
    }
    public int reverseusingRecursion(int n){
        if(n==1) return 1;
        System.out.print(n+" ");
        return reverseusingRecursion(n-1);

    }
}
