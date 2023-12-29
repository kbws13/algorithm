package xyz.kbws.awarry.level3;

/**
 * @author kbws
 * @date 2023/12/29
 * @description:
 */
public class SortColors {
    public void sortColor1(int[] nums) {
        int n = nums.length;
        int left = 0;
        //将所有的0交换到数组的最前面
        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }

        //将所有的1交换到2的前面
        for (int right = left; right < n; ++right) {
            if (nums[right] == 1) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                ++left;
            }
        }
    }

    /**
     * 一次遍历完成排序
     * @param nums
     */
    public void sortColors(int[] nums) {
        int left=0,right=nums.length-1;
        int index=0;
        while(index<=right){
            if(nums[index]==0)
                swap(nums,index++,left++);
            else if(nums[index]==2)
                swap(nums,index,right--);
            else
                index++;
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
