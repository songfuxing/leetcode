package listNode;

/**
 * 单链表反转
 */
public class Reserve {
    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre; // 这里返回的是pre，因为循环中已经"进位"
    }

    public static void main(String[] args) {
        ListNode head = ListNode.create();
        head.print();
        ListNode reverse = reverse(head);
        reverse.print();
    }
}
