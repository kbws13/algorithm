package xyz.kbws.Math.level2;

/**
 * @author kbws
 * @date 2024/1/15
 * @description: <a href="https://leetcode.cn/problems/power-of-three/description/">求2的幂</a>
 */
public class IsPowerOfThree {
    public boolean isPowerOfThree1(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
    public boolean isPowerOfThree2(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
