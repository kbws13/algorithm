package xyz.kbws.reverselist;

/**
 * @author kbws
 * @date 2023/12/24
 * @description:
 */
public class task {
    public static void main(String[] args) {
        int[] scores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ListNode head = createLinkedList(scores);

        ListNode result = arrangePairs(head);
        printList(result);
    }

    // 创建单链表
    private static ListNode createLinkedList(int[] scores) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int score : scores) {
            current.next = new ListNode(score);
            current = current.next;
        }

        return dummy.next;
    }

    // 打印链表
    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // 反转链表
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // 合并两个链表
    private static ListNode mergeLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            current.next = list1;
            list1 = list1.next;
            current = current.next;

            current.next = list2;
            list2 = list2.next;
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }

        if (list2 != null) {
            current.next = list2;
        }

        return dummy.next;
    }

    // 编排帮扶对子
    private static ListNode arrangePairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = reverseList(head.next);
        head.next = null;

        ListNode result = mergeLists(odd, even);

        return result;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
