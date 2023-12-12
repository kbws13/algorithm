package xyz.kbws.linklist.level2.topic2_4双指针.topic2_4_2旋转链表;

import xyz.kbws.linklist.level1.ListNode;

/**
 * @author kbws
 * @date 2023/12/12
 * @description:
 */
public class rotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) {
            return head;
        }
        ListNode temp = head;
        ListNode fast = head;
        ListNode slow = head;
        int len = 0;
        // 计算链表长度
        while(head != null) {
            head = head.next;
            len++;
        }
        // 移动长度等于链表长度
        if(k % len == 0) {
            return temp;
        }
        // 使用取模，是为了防止k大于len
        while((k % len) > 0) {
            k--;
            fast = fast.next;
        }
        // 快慢指针一起移动
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode res = slow.next;
        slow.next = null;
        fast.next = temp;
        return res;
    }
}
