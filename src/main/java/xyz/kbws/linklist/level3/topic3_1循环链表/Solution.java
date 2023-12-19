package xyz.kbws.linklist.level3.topic3_1循环链表;

import xyz.kbws.linklist.level1.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kbws
 * @date 2023/12/17
 * @description:
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        Set<ListNode> visited = new HashSet<ListNode>();
        while (pos != null) {
            if (visited.contains(pos)) {
                return pos;
            } else {
                visited.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }

    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return true;
        }
        return false;
    }

    /**
     * 寻找环的入口
     */
    public ListNode detectCycle2(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while(fast != null) {
            slow = slow.next;
            if(fast.next != null) {
                fast = fast.next.next;
            }else {
                return null;
            }
            if(fast == slow) {
                ListNode prt = head;
                while(prt != slow) {
                    prt = prt.next;
                    slow = slow.next;
                }
                return prt;
            }
        }
        return null;
    }
}
