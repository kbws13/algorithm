package xyz.kbws.awarry.level2;

/**
 * @author kbws
 * @date 2023/12/27
 * @description:
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        for(int fast = 0;fast < nums.length; fast++) {
            if(nums[fast] != nums[slow-1]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
