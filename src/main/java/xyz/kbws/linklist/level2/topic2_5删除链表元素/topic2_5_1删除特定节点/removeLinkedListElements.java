package xyz.kbws.linklist.level2.topic2_5删除链表元素.topic2_5_1删除特定节点;

import xyz.kbws.linklist.level1.ListNode;

/**
 * @author kbws
 * @date 2023/12/12
 * @description:
 */
public class removeLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode cur = dummyNode;
        while(cur.next != null) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return dummyNode.next;
    }
}
