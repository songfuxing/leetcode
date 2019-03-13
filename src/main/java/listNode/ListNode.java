package listNode;

/**
 * Created by songfuxing on 2018/11/9.
 */
public class ListNode {
     int val;
     ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode create() {
        ListNode head = null;
        ListNode cur = null;
        for(int i = 0; i < 10; i++) {
            ListNode node = new ListNode(i);
            if (head == null) {
                head = node;
                cur = head;
            } else {
                cur.next = node;
                cur = cur.next;
            }
        }
        return head;
    }

    public void print() {
        ListNode cur = this;
        while(cur != null) {
            System.out.print(cur.val + "\t");
            cur = cur.next;
        }
        System.out.print("\n");
    }
}
