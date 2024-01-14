package xyz.kbws.BitreeBisearch.level2;

/**
 * @author kbws
 * @date 2024/1/14
 * @description:
 */
public class FindMinInRotatedSortedArray {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + ((high - low) >> 1);
            if (nums[pivot] < nums[high]) {
                high = pivot;
            }else {
                low = pivot + 1;
            }
        }
        return nums[low];
    }
}
