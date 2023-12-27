package xyz.kbws.awarry.level2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kbws
 * @date 2023/12/27
 * @description:
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int slow = 0;
        for(int fast = 0; fast < nums.length; fast++) {
            if(fast + 1 == nums.length || nums[fast] + 1 != nums[fast + 1]) {
                StringBuilder sb = new StringBuilder();
                sb.append(nums[slow]);
                if(slow != fast) {
                    sb.append("->").append(nums[fast]);
                }
                res.add(sb.toString());
                slow = fast + 1;
            }
        }
        return res;
    }
}
