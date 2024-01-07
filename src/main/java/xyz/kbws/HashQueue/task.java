package xyz.kbws.HashQueue;

/**
 * @author kbws
 * @date 2024/1/7
 * @description:
 */
public class task {
    public static void main(String[] args) {
        LinkQueue NewQueue = new LinkQueue();
        LinkQueue FinishQueue = new LinkQueue();
        // 向需求队列写入需求
        NewQueue.push(1);
        NewQueue.push(2);
        NewQueue.push(3);
        // 一个任务从需求队列中出队，写入完成队列中
        finish(NewQueue, FinishQueue);
        // 遍历两个队列
        NewQueue.traverse();
        FinishQueue.traverse();
    }

    public static void finish(LinkQueue NewQueue, LinkQueue FinishQueue) {
        FinishQueue.push(NewQueue.pull());
    }
}



class LinkQueue {
    private Node front;
    private Node rear;
    private int size;

    public LinkQueue() {
        this.front = new Node(0);
        this.rear = new Node(0);
    }

    /**
     * 入队
     */
    public void push(int value) {
        Node newNode = new Node(value);
        Node temp = front;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        rear = newNode;
        size++;
    }

    /**
     * 出队
     */
    public int pull() {
        if (front.next == null) {
            System.out.println("队列已空");
        }
        Node firstNode = front.next;
        front.next = firstNode.next;
        size--;
        return firstNode.data;
    }

    /**
     * 遍历队列
     */
    public void traverse() {
        Node temp = front.next;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}