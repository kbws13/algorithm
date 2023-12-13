package xyz.kbws.linklist.level2.topic2_5删除链表元素.topic2_5_3删除重复元素;

import xyz.kbws.linklist.level1.ListNode;

/**
 * @author kbws
 * @date 2023/12/12
 * @description: 重复元素保留一个
 */
public class deleteDuplicateElements {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode cur = head;
        while(cur.next != null) {
            if(cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }
}
