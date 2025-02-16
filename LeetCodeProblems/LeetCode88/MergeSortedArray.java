package LeetCodeProblems.LeetCode88;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for(int i=0; i<n;i++){
                nums1[i]=nums2[i];
            }
        }
        int pos = m+n-1;
        int pointer1 =m-1;
        int pointer2 =n-1;
        while(pointer1>=0 && pointer2>=0){
            if( nums1[pointer1] >nums2[pointer2] ){
                nums1[pos]=nums1[pointer1];
                pointer1--;
            }
            else{
                nums1[pos]=nums2[pointer2];
                pointer2--;
            }
            pos--;
        }
        while(pointer1>=0){
            nums1[pos]=nums1[pointer1];
            pointer1--;
            pos--;
        }
        while(pointer2>=0){
            nums1[pos]=nums2[pointer2];
            pointer2--;
            pos--;
        }
    }
}
