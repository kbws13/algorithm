package xyz.kbws.reverselist.level2;

import xyz.kbws.linklist.level1.ListNode;

import java.util.Stack;

/**
 * @author kbws
 * @date 2023/12/23
 * @description:
 */
public class plusone {
    public ListNode plusOne(ListNode head) {
        Stack<Integer> st = new Stack();
        while (head != null) {
            st.push(head.val);
            head = head.next;
        }
        int carry = 0;
        ListNode dummy = new ListNode(0);
        int adder = 1;
        while (!st.empty() || carry > 0) {
            int digit = st.empty() ? 0 : st.pop();
            int sum = digit + adder + carry;
            carry = sum >= 10 ? 1 : 0;
            sum = sum >= 10 ? sum - 10 : sum;
            ListNode cur = new ListNode(sum);
            cur.next = dummy.next;
            dummy.next = cur;
            adder = 0;
        }
        return dummy.next;
    }
}
