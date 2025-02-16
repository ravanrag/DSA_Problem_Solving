package GeeksForGeeks;

import java.util.ArrayList;

public class MissingAndRepeating {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        int i=0;
        ArrayList<Integer> res = new ArrayList<>();

        while(i<n){
            if(arr[i]!=(i+1) && arr[arr[i]-1]!=arr[i]){
                swap(arr,i,arr[i]-1);
            }
            else
                i++;
        }
        for(i=0; i<n; i++){
            if(arr[i]!=i+1){
                res.add(arr[i]);
                res.add(i+1);
                break;
            }
        }
        return res;
    }
    public static void swap(int[] arr, int i, int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
