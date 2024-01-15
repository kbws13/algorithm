package xyz.kbws.Bit.level2;

/**
 * @author kbws
 * @date 2024/1/15
 * @description:
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int reversed = 0, power = 31;
        while (n != 0) {
            reversed += (n & 1) << power;
            n >>>= 1;
            power--;
        }
        return reversed;
    }
}
