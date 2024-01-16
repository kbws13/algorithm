package xyz.kbws.Slide.level1;

/**
 * @author kbws
 * @date 2024/1/16
 * @description: <a href="https://leetcode.cn/problems/maximum-average-subarray-i/description/">子数组最大平均数</a>
 */
public class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int windowSum = 0;
        if (k > nums.length || nums.length < 1 || k < 1) {
            return 0;
        }
        //   第一步 先求第一个窗口的和
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        //  第二步 ：遍历，每次右边增加一个，左边减去一个，重新计算窗口最大值
        int res = windowSum;
        for (int right = k; right < len; right++) {
            windowSum += nums[right] - nums[right - k];
            res = Math.max(res, windowSum);
        }
        return (double) res / k;
    }
}