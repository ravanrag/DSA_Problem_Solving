package Scaler;

public class ReverseAnArray {
    public static int[] reverseAnArray(int[] arr) {
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}
