package xyz.kbws.linklist.level2.topic2_6再论公共子节点;

import xyz.kbws.linklist.level1.ListNode;

/**
 * @author kbws
 * @date 2023/12/13
 * @description:
 */
public class Solution {
    /**
     * 双指针
     */
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        ListNode p1 = headA;
        ListNode p2 = headB;
        while(p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
            if(p1 != p2) {
                if(p1 == null) {
                    p1 = headB;
                }
                if(p2 == null) {
                    p2 = headA;
                }
            }
        }
        return p1;
    }

    /**
     * 使用差和双指针
     */
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        ListNode current1=headA;
        ListNode current2=headB;
        int l1=0,l2=0;
        //分别统计两个链表的长度
        while(current1!=null){
            current1=current1.next;
            l1++;
        }

        while(current2!=null){
            current2=current2.next;
            l2++;
        }
        current1=headA;
        current2=headB;
        int sub=l1>l2?l1-l2:l2-l1;
        //长的先走sub步
        if(l1>l2){
            int a=0;
            while(a<sub){
                current1=current1.next;
                a++;
            }
        }

        if(l1<l2){
            int a=0;
            while(a<sub){
                current2=current2.next;
                a++;
            }
        }
        //同时遍历两个链表
        while(current2!=current1){
            current2=current2.next;
            current1=current1.next;
        }

        return current1;
    }
}
