package xyz.kbws.awarry.level1;

/**
 * @author kbws
 * @date 2023/12/25
 * @description:
 */
public class MergeArray {
    /**
     * 合并两个有序链表
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int len1 = m - 1;
        int len2 = n - 1;

        while(len1 >= 0 && len2 >= 0) {
            if(nums1[len1] <= nums2[len2]) {
                nums1[i--] = nums2[len2--];
            }else if(nums1[len1] > nums2[len2]) {
                nums1[i--] = nums1[len1--];
            }
        }

        while(len2 != -1) nums1[i--] = nums2[len2--];
        while(len1 != -1) nums1[i--] = nums1[len1--];
    }
}
