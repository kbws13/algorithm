package xyz.kbws.reverselist.level3;

import xyz.kbws.linklist.level1.ListNode;

/**
 * @author kbws
 * @date 2023/12/24
 * @description:
 */
public class KNode {
    public ListNode reverseKGroup1(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        int len = 0;
        while(cur != null) {
            len++;
            cur = cur.next;
        }
        int n = len/k;
        ListNode pre = dummy;
        cur = head;
        for(int i=0;i<n;i++) {
            for(int j=0;j<k-1;j++) {
                ListNode next = cur.next;
                cur.next = cur.next.next;
                next.next = pre.next;
                pre.next = next;
            }
            pre = cur;
            cur = cur.next;
        }
        return dummy.next;
    }

    public ListNode reverseKGroup2(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode end = dummy;

        while (end.next != null) {
            //找到要处理的区间的末尾
            for (int i = 0; i < k && end != null; i++){
                end = end.next;
            }
            if (end == null){
                break;
            }
            //将要处理的区间裁剪下来
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            //执行反转
            pre.next = reverse(start);
            // 上面pre.next和下面start.next两个指针是为了将反转的区间缝补回去
            start.next = next;
            //调整指针，为下一组做准备
            pre = start;
            end = pre;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
