package xyz.kbws.Bit.level2;

/**
 * @author kbws
 * @date 2024/1/15
 * @description: <a href="https://leetcode.cn/problems/sum-of-two-integers/description/">LeetCode</a>
 */
public class Sum {
    public int getSum(int a, int b) {
        while (b != 0) {
            int sign = (a & b) << 1;
            a = a ^ b;
            b = sign;
        }
        return a;
    }
}
