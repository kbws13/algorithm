package xyz.kbws.BitreeBisearch.level1;

/**
 * @author kbws
 * @date 2024/1/13
 * @description:
 */
public class BinarySearch {
    public int search1(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] > target) {
                // 由于array[mid]不是目标值，因此再次递归搜索时，可以将其排除
                high = mid - 1;
            }else {
                // 由于array[mid]不是目标值，因此再次递归搜索时，可以将其排除
                low = mid + 1;
            }
        }
        return -1;
    }

    public  int search2(int[] array, int low, int high, int target) {
        //递归终止条件
        if(low <= high){
            int mid = low + ((high - low) >> 1);
            if(array[mid] == target){
                return mid  ;  // 返回目标值的位置，从1开始
            }else if(array[mid] > target){
                // 由于array[mid]不是目标值，因此再次递归搜索时，可以将其排除
                return search2(array, low, mid-1, target);
            }else{
                // 由于array[mid]不是目标值，因此再次递归搜索时，可以将其排除
                return search2(array, mid+1, high, target);
            }
        }
        return -1;   //表示没有搜索到
    }

    /**
     * 有重复元素的二分查找
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                //找到之后，往左边找
                while (mid != 0 && nums[mid] == target)
                    mid--;
                if (mid == 0 && nums[mid] == target) {
                    return mid;
                }
                return mid + 1;
            }
        }
        return -1;
    }
}
