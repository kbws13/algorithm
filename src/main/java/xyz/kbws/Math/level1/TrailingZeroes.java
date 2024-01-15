package xyz.kbws.Math.level1;

/**
 * @author kbws
 * @date 2024/1/15
 * @description: <a href="https://leetcode.cn/problems/factorial-zeros-lcci/description/">阶乘零的个数</a>
 */
public class TrailingZeroes {
    public int trailingZeroes(int n) {
        int cnt = 0;
        for (long num = 5; n / num > 0; num *= 5) {
            cnt += n / num;
        }
        return cnt;
    }
}
