package xyz.kbws.awarry;

/**
 * @author kbws
 * @date 2023/12/29
 * @description: 删除有序数组中的重复项：在单调数组中，将出现的重复元素一个都不要（使用双指针）
 */
public class task {
    public static void removeDuplicates(int[] nums) {
        int slow = 0, fast = 0;
        while(nums[slow] != nums[slow+1]) {
            slow++;
        }
        for(fast=slow;fast<nums.length-1;fast++) {
            if(nums[slow] != nums[fast] && nums[fast] != nums[fast + 1]) {
                if (fast!=0 && nums[fast] == nums[fast-1]) {
                    continue;
                }
                nums[slow] = nums[fast];
                slow++;
            }
        }
        if (fast != nums.length) {
            nums[slow] = nums[fast];
        }
        for (int i = 0; i <= slow; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1,1,2,2,3,4,5};
        int[] test2 = new int[]{0,2,2,2,2,2,5};
        removeDuplicates(test1);
        //removeDuplicates(test2);
    }
}
