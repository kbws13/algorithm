package xyz.kbws.String.level2;

/**
 * @author kbws
 * @date 2024/1/15
 * @description: <a href="https://leetcode.cn/problems/reverse-string/description/">反转字符串</a>
 */
public class ReverseString {
    public void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return ;
        }
        int n = s.length;
        for (int left = 0, right = n - 1; left < right; ++left, --right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
        }
    }
}
