package xyz.kbws.linklist.level2.topic2_1第一个公共子节点;

import xyz.kbws.linklist.level1.ListNode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author kbws
 * @date 2023/11/29
 * @description: 第一个公共子节点
 */
public class FindFirstCommonNode {
    /**
     * 使用哈希
     * @param headA
     * @param headB
     * @return
     */
    public ListNode findFirstCommonNodeBySet(ListNode headA, ListNode headB){
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    /**
     * 使用栈
     * @param headA
     * @param headB
     * @return
     */
    public ListNode findFirstCommonNodeByStack(ListNode headA, ListNode headB) {
        Stack<ListNode> stackA = new Stack<>();
        Stack<ListNode> stackB = new Stack<>();
        while (headA != null) {
            stackA.push(headA);
            headA = headA.next;
        }
        while (headB != null) {
            stackB.push(headB);
            headB = headB.next;
        }

        ListNode preNode = null;
        while (stackA.size()>0 && stackB.size()>0) {
            if (stackA.peek() == stackB.peek()) {
                preNode = stackA.pop();
                stackB.pop();
            }else {
                break;
            }
        }
        return preNode;
    }
}
