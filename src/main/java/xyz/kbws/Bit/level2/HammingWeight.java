package xyz.kbws.Bit.level2;

/**
 * @author kbws
 * @date 2024/1/15
 * @description:
 */
public class HammingWeight {
    public int hammingWeight1(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += (n >> i) & 1;
        }
        return count;
    }

    public int hammingWeight2(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
