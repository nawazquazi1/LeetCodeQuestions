import java.util.ArrayList;
import java.util.List;

public class Question_24 {
    public boolean isPalindrome(ListNode1 head) {

        List<Integer> list = new ArrayList();
        list.add(head.val);

        // Phase 1, look the Approach section
        while (head.next != null) {
            head = head.next;
            list.add(head.val);
        }

        // Phase 2, look the Approach section
        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals(list.get(list.size() - i - 1)))
                return false;
        }

        return true;
    }
}

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1() {
    }

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }
}