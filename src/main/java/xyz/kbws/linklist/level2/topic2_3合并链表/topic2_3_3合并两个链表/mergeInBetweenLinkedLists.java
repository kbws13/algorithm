package xyz.kbws.linklist.level2.topic2_3合并链表.topic2_3_3合并两个链表;

import xyz.kbws.linklist.level1.ListNode;

/**
 * @author kbws
 * @date 2023/12/11
 * @description: 合并两个链表
 */
public class mergeInBetweenLinkedLists {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode pre = list1, post1 = list1, post2 = list2;
        int i = 0, j =0;
        while(j < b && pre != null && post1 != null) {
            if(i != a-1) {
                pre = pre.next;
                i++;
            }
            if(j != b) {
                post1 = post1.next;
                j++;
            }
        }
        while(post2.next != null) {
            post2 = post2.next;
        }
        pre.next = list2;
        post2.next = post1.next;
        return list1;
    }
}
