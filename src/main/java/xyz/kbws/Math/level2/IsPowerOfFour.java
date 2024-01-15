package xyz.kbws.Math.level2;

/**
 * @author kbws
 * @date 2024/1/15
 * @description: <a href="https://leetcode.cn/problems/power-of-four/description/">求2的幂</a>
 */
public class IsPowerOfFour {
    boolean isPowerOfFour1(int n) {
        if (n <= 0)
            return false;
        while (n % 4 == 0)
            n /= 4;
        return n == 1;
    }
}
