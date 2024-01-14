package xyz.kbws.BitreeBisearch.level2;

/**
 * @author kbws
 * @date 2024/1/14
 * @description:
 */
public class OptimizeSqrt {
    public int sqrt(int x) {
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (x / mid > mid) {
                left = mid + 1;
            }else if (x / mid < mid) {
                right = mid - 1;
            }else if (x / mid == mid) {
                return mid;
            }
        }
        return right;
    }
}
