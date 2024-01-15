package xyz.kbws.Bit.level2;

/**
 * @author kbws
 * @date 2024/1/15
 * @description:
 */
public class CountBits {
    public int[] countBits1(int num) {
        int[] bits = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < 32; j++) {
                bits[i] += (i >> j) & 1;
            }
        }
        return bits;
    }

    public int[] countBits2(int num) {
        int[] bits = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            bits[i] = countOnes(i);
        }
        return bits;
    }

    public int countOnes(int x) {
        int ones = 0;
        while (x > 0) {
            x &= (x - 1);
            ones++;
        }
        return ones;
    }
}
