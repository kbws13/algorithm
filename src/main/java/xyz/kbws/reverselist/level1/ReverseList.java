package xyz.kbws.reverselist.level1;

import xyz.kbws.linklist.level1.ListNode;

/**
 * @author kbws
 * @date 2023/12/20
 * @description:
 */
public class ReverseList {
    /**
     * 带虚拟头节点
     * @param head
     * @return
     */
    ListNode reverseList1(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = head;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = dummy.next;
            dummy.next = cur;
            cur = next;
        }
        return dummy.next;
    }

    /**
     * 不带虚拟头结点
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    /**
     * 使用递归来反转链表
     * @param head
     * @return
     */
    public ListNode reverseList3(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList3(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
