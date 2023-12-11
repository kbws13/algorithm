package xyz.kbws.linklist.level2.topic2_2回文链表;

import xyz.kbws.linklist.level1.ListNode;

import java.util.Stack;

/**
 * @author kbws
 * @date 2023/12/2
 * @description: 回文链表
 */
public class PalindromesLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack();
        // 把链表节点的值放入栈中
        while(temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        // 然后一边出栈一边比较
        while(head != null) {
            if(head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
