package listNode;

/**
 * 有序链表合并
 */
public class MergeTwoList {
    /**
     * 新建一个链表，把小的接入
     * @param l1
     * @param l2
     * @return
     */
    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode preHead = new ListNode(-1), cur = preHead;
        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null? l1: l2;
        return preHead.next;
    }
}
