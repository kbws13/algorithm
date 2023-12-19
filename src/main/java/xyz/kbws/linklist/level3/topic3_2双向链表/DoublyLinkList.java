package xyz.kbws.linklist.level3.topic3_2双向链表;

/**
 * @author kbws
 * @date 2023/12/19
 * @description:
 */
public class DoublyLinkList {
    private DoubleNode first;
    private DoubleNode last;
    public DoublyLinkList() {
        first = null;
        last = first;
    }
    //从头部开始打印
    public void displayForward() {
        System.out.print("List(first--->last): ");
        DoubleNode current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    //从尾部开始演绎
    public void displayBackward() {
        System.out.print("List(last--->first): ");
        DoubleNode current = last;
        while (current != null) {
            current.displayNode();
            current = current.prev;
        }
        System.out.println();
    }

    // 头插法
    public void insertFirst(int data) {
        DoubleNode newDoubleNode = new DoubleNode(data);
        if (first == null) {
            last = newDoubleNode;
        }else {
            first.prev = newDoubleNode;
        }
        newDoubleNode.next = first;
        first = newDoubleNode;
    }

    // 尾插法
    public void insertLast(int data) {
        DoubleNode newDoubleNode = new DoubleNode(data);
        if (first == null) {
            first = newDoubleNode;
        }else {
            newDoubleNode.prev = last;
            last.next = newDoubleNode;
        }
        last = newDoubleNode;
    }

    // 中间插入
    public void insertAfter(int key, int data) {
        DoubleNode newDoubleNode = new DoubleNode(data);
        DoubleNode current = first;
        while ((current != null) && (current.data != key)) {
            current = current.next;
        }
        if (current == null) {
            if (first == null) {
                first = newDoubleNode;
                last = newDoubleNode;
            } else {
                last.next = newDoubleNode;
                newDoubleNode.prev = first;
                last = newDoubleNode;
            }
        } else {
            if (current == last) {
                newDoubleNode.next = null;
                last = newDoubleNode;
            }else {
                newDoubleNode.next = current.next;
                current.next.prev = newDoubleNode;
            }
            current.next = newDoubleNode;
            newDoubleNode.next = current;
        }
    }

    // 删除首元素
    public DoubleNode deleteFirst() {
        DoubleNode temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.prev = null;
        }
        first = first.next;
        return temp;
    }

    // 删除尾元素
    public DoubleNode deleteLast() {
        DoubleNode temp = last;
        if (first.next == null) {
            first = null;
        }else {
            last.prev.next = null;
        }
        last = last.prev;
        return temp;
    }

    // 删除中间节点
    public DoubleNode deleteKey(int key) {
        DoubleNode current = first;
        //遍历链表寻找该值所在的结点
        while (current != null && current.data != key) {
            current = current.next;
        }
        //若当前结点指向null则返回null，
        if (current == null) {
            return null;
        } else {
            //如果current是第一个结点
            if (current == first) {
                //则将first指向它，将该结点的previous指向null,其余不变
                first = current.next;
                current.next.prev = null;
            } else if (current == last) {
                //如果current是最后一个结点
                last = current.prev;
                current.prev.next = null;
            } else {
                //当前结点的上一个结点的next域应指向当前的下一个结点
                current.prev.next = current.next;
                //当前结点的下一个结点的previous域应指向当前结点的上一个结点
                current.next.prev = current.prev;
            }
        }
        return current;        //返回
    }
}

class DoubleNode {
    public int data;    //数据域
    public DoubleNode next;    //指向下一个结点
    public DoubleNode prev;    // 指向上一个节点
    public DoubleNode(int data) {
        this.data = data;
    }
    //打印结点的数据域
    public void displayNode() {
        System.out.print("{" + data + "} ");
    }
}
