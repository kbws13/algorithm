package xyz.kbws.reverselist.level2;

import xyz.kbws.linklist.level1.ListNode;

/**
 * @author kbws
 * @date 2023/12/23
 * @description:
 */
public class reverseBetween {
    public ListNode reverseBetween1(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i=0; i<left-1;i++) {
            pre = pre.next;
        }

        ListNode rightNode = pre;
        for(int i=0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }

        ListNode leftNode = pre.next;
        ListNode succ = rightNode.next;

        rightNode.next = null;

        reverseLinkedList(leftNode);

        pre.next = rightNode;
        leftNode.next = succ;
        return dummy.next;
    }
    private void reverseLinkedList(ListNode head) {
        // 也可以使用递归反转一个链表
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null && temp.next.next != null) {
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;
        }
        return dummyHead.next;
    }
}
