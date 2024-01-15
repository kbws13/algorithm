package xyz.kbws.Math.level2;

/**
 * @author kbws
 * @date 2024/1/15
 * @description: <a href="https://leetcode.cn/problems/power-of-two/description/">求2的幂</a>
 */
public class IsPowerOfTwo {
    boolean isPowerOfTwo1(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public boolean isPowerOfTwo2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
