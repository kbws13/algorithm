package xyz.kbws.Slide.level1;

/**
 * @author kbws
 * @date 2024/1/16
 * @description: <a href="https://leetcode.cn/problems/longest-continuous-increasing-subsequence/description/">最长连续增长序列</a>
 */
public class FindLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        int left = 0, right = 0;
        int res = 0;
        while (right < nums.length) {
            //右侧的新元素比左侧的小，则重新开始记录left位置
            //该问题本质就是快慢指针，left就是slow指针
            if (right > 0 && nums[right-1] >= nums[right]) {
                left = right;
            }
            right++;
            res = Math.max(res, right-left);
        }
        return res;
    }
}
