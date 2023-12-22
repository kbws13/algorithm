package xyz.kbws.reverselist.level2;

import xyz.kbws.linklist.level1.ListNode;

/**
 * @author kbws
 * @date 2023/12/22
 * @description:
 */
public class reverseLinkedList_2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i=0; i<left-1;i++) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        ListNode next;
        for(int i=0; i< right - left;i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return dummy.next;
    }
}
