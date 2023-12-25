package xyz.kbws.awarry.level1;

/**
 * @author kbws
 * @date 2023/12/25
 * @description:
 */
public class MonotonicArray {
    /**
     * 判断是否为单调数组
     * @param nums
     * @return
     */
    public boolean isMonotonic(int[] nums) {
        return (isSort(nums, true) || isSort(nums, false));
    }
    public boolean isSort(int[] nums, boolean increasing) {
        int len = nums.length;
        for(int i=0;i<len-1;i++) {
            if(increasing) {
                if(nums[i] > nums[i+1]) {
                    return false;
                }
            }else{
                if (nums[i] < nums[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 优化后的代码，只需要遍历一次
     * @param nums
     * @return
     */
    public boolean isMonotonicPlus(int[] nums) {
        boolean inc = true, dec = true;
        int n = nums.length;
        for (int i = 0; i < n - 1; ++i) {
            if (nums[i] > nums[i + 1]) {
                inc = false;
            }
            if (nums[i] < nums[i + 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }
}
