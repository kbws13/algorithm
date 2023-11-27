package xyz.kbws.linklist.level1;

/**
 * @author kbws
 * @date 2023/11/27
 * @description: 链表定义
 */
public class ListNode {
    // 节点的值
    public int val;
    // 下一个节点
    public ListNode next;

    // 节点的构造函数(无参)
    public ListNode() {
    }

    // 节点的构造函数(有参)
    public ListNode(int val) {
        this.val = val;
    }

    // 节点的构造函数(有两个参数)
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void main(String[] args) {
        ListNode listnode = new ListNode(1);
    }
}
