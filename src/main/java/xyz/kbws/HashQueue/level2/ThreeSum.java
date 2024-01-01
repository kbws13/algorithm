package xyz.kbws.HashQueue.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kbws
 * @date 2024/1/1
 * @description:
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        // 枚举a
        for (int first = 0; first < n; first++) {
            // 需要和上一次枚举的值不同
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            // c 对应的指针初始指向数组的最右端
            int third = n - 1;
            int target = -nums[first];
            for (int second = first + 1; second < n; second++) {
                // 需要和上一次枚举的值不同
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                // 需要保证 b 的指针在 c 的指针的左侧
                while (second < third && nums[second] + nums[third] > target) {
                    third--;
                }
                // 如果指针重合，随着 b 后续的增加就不会有满足 a+b+c=0 并且 b < c的c了，可以退出循环
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    res.add(list);
                }
            }
        }
        return res;
    }
}
