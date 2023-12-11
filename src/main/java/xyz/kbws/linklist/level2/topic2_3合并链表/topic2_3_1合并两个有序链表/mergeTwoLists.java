package xyz.kbws.linklist.level2.topic2_3合并链表.topic2_3_1合并两个有序链表;

import xyz.kbws.linklist.level1.ListNode;

/**
 * @author kbws
 * @date 2023/12/2
 * @description: 合并两个有序链表
 */
public class mergeTwoLists {
    public ListNode mergeTwoList(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(-1);
        ListNode pre = preHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                pre.next = list1;
                list1 = list1.next;
            }else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }
        // 最多只有一个没有被合并，这时候判断并合并
        pre.next = list1 == null ? list2 : list1;
        return preHead.next;
    }

}
