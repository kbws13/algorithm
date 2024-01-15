package xyz.kbws.Quicksort.level1;

/**
 * @author kbws
 * @date 2024/1/15
 * @description:
 */
public class QuickSortBasic {
    public void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        //这里就是一个对撞的双指针操作
        int left = start, right = end;
        int pivot = array[(start + end) / 2];

        while (left <= right) {
            while (left <= right && array[left] < pivot) {
                left++;
            }
            while (left <= right && array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        //先处理元素再分别递归处理两侧分支，与二叉树的前序遍历非常像
        quickSort(array, start, right);
        quickSort(array, left, end);
    }
}
