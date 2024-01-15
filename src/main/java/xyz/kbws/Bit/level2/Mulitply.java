package xyz.kbws.Bit.level2;

/**
 * @author kbws
 * @date 2024/1/15
 * @description: <a href="https://leetcode.cn/problems/recursive-mulitply-lcci/description/">LeetCode</a>
 */
public class Mulitply {
    public int multiply(int A, int B) {
        int min = Math.min(A, B);
        int max = Math.max(A, B);
        int ans = 0;
        for (int i = 0; min != 0; i++) {
            //位为1时才更新ans，否则max一直更新
            if ((min & 1) == 1) {
                ans += max;
            }
            min >>= 1;
            max+=max;
        }
        return ans;
    }
}
