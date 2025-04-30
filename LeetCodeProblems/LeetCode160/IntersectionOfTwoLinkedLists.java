package LeetCodeProblems.LeetCode160;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A=headA;
        ListNode B=headB;
        int countA=0;
        int countB=0;
        while(A!=null){
            A=A.next;
            countA++;
        }
        while(B!=null){
            B=B.next;
            countB++;
        }
        A=headA;
        B=headB;
        if(countA>countB){
            int temp=countA-countB;
            for(int i=0; i<temp;i++){
                A=A.next;
            }
        }
        else if(countA<countB){
            int temp=countB-countA;
            for(int i=0; i<temp;i++){
                B=B.next;
            }
        }
        while(A!=null){
            if(A==B && A.val==B.val){
                return A;
            }
            A=A.next;
            B=B.next;
        }

        return null;

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}