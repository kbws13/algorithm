package xyz.kbws.reverselist.level2;

import xyz.kbws.linklist.level1.ListNode;

import java.util.Stack;

/**
 * @author kbws
 * @date 2023/12/23
 * @description:
 */
public class addTwoNumbers2 {
    public static ListNode addInListByStack(ListNode head1, ListNode head2) {
        Stack<ListNode> st1 = new Stack<ListNode>();
        Stack<ListNode> st2 = new Stack<ListNode>();
        while (head1 != null) {
            st1.push(head1);
            head1 = head1.next;
        }
        while (head2 != null) {
            st2.push(head2);
            head2 = head2.next;
        }
        ListNode newHead = new ListNode(-1);
        int carry = 0;
        //这里设置carry!=0,是因为当st1,st2都遍历完时，如果carry=0,就不需要进入循环了
        while (!st1.empty() || !st2.empty() || carry != 0) {
            ListNode a = new ListNode(0);
            ListNode b = new ListNode(0);
            if (!st1.empty()) {
                a = st1.pop();
            }
            if (!st2.empty()) {
                b = st2.pop();
            }
            //每次的和应该是对应位相加再加上进位
            int get_sum = a.val + b.val + carry;
            //对累加的结果取余
            int ans = get_sum % 10;
            //如果大于0，就进位
            carry = get_sum / 10;
            ListNode cur = new ListNode(ans);
            cur.next = newHead.next;
            //每次把最新得到的节点更新到neHead.next中
            newHead.next = cur;
        }
        return newHead.next;
    }

    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        head1 = reverse(head1);
        head2 = reverse(head2);
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        int carry = 0;
        while(head1 != null || head2 != null) {
            int val = carry;
            if (head1 != null) {
                val += head1.val;
                head1 = head1.next;
            }
            if (head2 != null) {
                val += head2.val;
                head2 = head2.next;
            }
            cur.next = new ListNode(val % 10);
            carry = val / 10;
            cur = cur.next;
        }
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }
        return reverse(head.next);
    }
    private ListNode reverse(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
