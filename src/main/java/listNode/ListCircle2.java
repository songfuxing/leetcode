package listNode;

/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 */
public class ListCircle2 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        ListNode slower = head;
        while (fast != slow) {
            if (fast == null || fast.next == null || fast.next.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        while (slow.next != slower) {
            slow = slow.next;
            slower = slower.next;
        }
        return slow.next;
    }
}
