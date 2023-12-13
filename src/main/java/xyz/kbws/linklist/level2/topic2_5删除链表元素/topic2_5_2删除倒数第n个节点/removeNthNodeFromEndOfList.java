package xyz.kbws.linklist.level2.topic2_5删除链表元素.topic2_5_2删除倒数第n个节点;

import xyz.kbws.linklist.level1.ListNode;

/**
 * @author kbws
 * @date 2023/12/12
 * @description:
 */
public class removeNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode demo = new ListNode(0);
        demo.next = head;
        ListNode fast = demo;
        ListNode slow = demo;

        for(int i=0; i<n;i++){
            fast = fast.next;
        }

        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return demo.next;
    }
}
