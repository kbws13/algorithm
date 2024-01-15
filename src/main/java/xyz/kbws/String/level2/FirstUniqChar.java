package xyz.kbws.String.level2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kbws
 * @date 2024/1/15
 * @description: <a href="https://leetcode.cn/problems/first-unique-character-in-a-string/description/">字符串中第一个唯一字符</a>
 */
public class FirstUniqChar {
    public int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch,0)+1);
        }
        for (int i=0; i<s.length(); i++) {
            if (frequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
