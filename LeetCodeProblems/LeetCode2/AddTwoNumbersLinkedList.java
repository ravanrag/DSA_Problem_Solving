package LeetCodeProblems.LeetCode2;

public class AddTwoNumbersLinkedList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode x = new ListNode(0);
        ListNode ans =x;
        int temp1, temp2, d=0;

        while(l1!=null || l2!=null || d!=0){
            if(l1!=null){
                temp1= l1.val;
                l1=l1.next;
            } else{ temp1= 0; }

            if(l2!=null){
                temp2 = l2.val;
                l2=l2.next;
            } else{ temp2= 0; }

            int sum = temp1 + temp2 + d;
            d=sum/10;
            x.next = new ListNode(sum%10);
            x=x.next;
        }
        return ans.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}