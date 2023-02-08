import java.util.LinkedList;

public class Question_14 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        while (curr!=null && curr.next!=null){
            if (curr.val==curr.next.val){
                curr.next=curr.next.next;
            }else {
                curr=curr.next;
            }
        }
        return head;
    }
}
class ListNode {
    public ListNode head;
    public ListNode tail;
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;
    }
}
