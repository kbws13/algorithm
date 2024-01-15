package xyz.kbws.Math.level1;

/**
 * @author kbws
 * @date 2024/1/15
 * @description: <a href="https://leetcode.cn/problems/sign-of-the-product-of-an-array/description/">符号统计</a>
 */
public class ArraySign {
    public int arraySign(int[] nums) {
        int prod = 1;
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] == 0) {
                return 0;//一切归零
            }else if(nums[i] < 0) {
                //交替就够了，很好的处理技巧
                prod = -prod;
            }
        }
        return prod;
    }
}
