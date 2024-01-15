package xyz.kbws.Math.level2;

/**
 * @author kbws
 * @date 2024/1/15
 * @description: <a href="https://leetcode.cn/problems/plus-one/description/">加一</a>
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i=len-1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        // 比较巧妙的设计
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
