package xyz.kbws.Stack.level3;

import java.util.Stack;

/**
 * @author kbws
 * @date 2023/12/30
 * @description: 逆波兰表达式
 */
public class EvaluateReverse {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (!Character.isDigit(token.charAt(0)) && token.length() == 1) {
                /**
                 * 运算符，从栈中取出两个数进行运算！
                 */
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    /**
                     * 根据运算符的种类进行计算
                     * 将结果直接入栈！
                     */
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            } else {
                /**
                 * 整数直接入栈！
                 */
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}