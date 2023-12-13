package xyz.kbws.linklist.level2.topic2_5删除链表元素.topic2_5_3删除重复元素;

import xyz.kbws.linklist.level1.ListNode;

/**
 * @author kbws
 * @date 2023/12/13
 * @description: 不保留重复元素
 */
public class removeDuplicatesFromSortedListIi {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0,head);
        ListNode cur = dummy;
        while(cur.next != null && cur.next.next != null) {
            if(cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while(cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            }else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
