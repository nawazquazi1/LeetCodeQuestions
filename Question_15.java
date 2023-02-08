import java.util.LinkedList;

public class Question_15 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        LinkedList<Integer> list = new LinkedList<>();
        ListNode one = list1.head;
        ListNode tow = list2.head;
        while (one != null && tow != null) {
            if (one.val < tow.val) {
                list.addLast(one.val);
                one = one.next;
            } else {
                list.addLast(tow.val);
            }
        }

        while (one != null) {
            list.addLast(one.val);
            one = one.next;
        }
        while (tow != null) {
            list.addLast(tow.val);
            tow = tow.next;
        }

        return list1;

    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode cur = prehead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = l1 == null ? l2 : l1;
        return prehead.next;
    }

    public static void main(String[] args) {

    }
}
