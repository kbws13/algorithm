package xyz.kbws.Stack.level1;

import java.util.Arrays;

/**
 * @author kbws
 * @date 2023/12/30
 * @description: 基于数组实现栈
 */
public class MyStack<T> {
    private Object[] stack;

    private int top;

    MyStack() {
        // 初始容量为 10
        stack = new Object[10];
    }

    // 判断是否为空
    public boolean isEmpty() {
        return top == 0;
    }

    // 返回栈顶元素
    public T peek() {
        T t = null;
        if (top > 0) {
            t = (T) stack[top - 1];
        }
        return t;
    }

    // 出栈
    public T pop() {
        T t = peek();
        if (top > 1) {
            stack[top - 1] = null;
            top--;
        }
        return t;
    }

    // 扩大容量
    public void expandCapacity(int size) {
        int len = stack.length;
        if (size > len) {
            // 每次扩大 50%
            size = size * 3 / 2 + 1;
            stack = Arrays.copyOf(stack, size);
        }
    }
}
