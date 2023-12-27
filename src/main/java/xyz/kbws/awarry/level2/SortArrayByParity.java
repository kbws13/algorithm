package xyz.kbws.awarry.level2;

/**
 * @author kbws
 * @date 2023/12/27
 * @description:
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right) {
            if(nums[left] % 2 > nums[right] % 2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            if(nums[left] % 2 == 0) left++;
            if(nums[right] % 2 == 1) right--;
        }
        return nums;
    }
}
