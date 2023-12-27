package xyz.kbws.awarry.level2;

/**
 * @author kbws
 * @date 2023/12/27
 * @description:
 */
public class RemoveElement {
    /**
     * 快慢指针
     * @param nums
     * @param val
     * @return
     */
    public int removeElement1(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }

    /**
     * 对撞双指针
     * @param nums
     * @param val
     * @return
     */
    public int removeElement2(int[] nums, int val) {
        int right = nums.length - 1;
        int left = 0;
        for(left = 0; left <= right; ) {
            if((nums[left] == val) && (nums[right] != val)) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }
            if(nums[left] != val) left++;
            if(nums[right] == val) right--;
        }
        return left;
    }
}
