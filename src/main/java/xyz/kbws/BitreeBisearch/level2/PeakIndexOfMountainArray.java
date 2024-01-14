package xyz.kbws.BitreeBisearch.level2;

/**
 * @author kbws
 * @date 2024/1/14
 * @description:
 */
public class PeakIndexOfMountainArray {
    /**
     * 遍历数组，找到第一个arr[i]>arr[i+1]的位置即可
     * @param arr
     * @return
     */
    public int peakIndexInMountainArray1(int[] arr) {
        int n = arr.length;
        int ans = -1;
        for (int i = 1; i < n - 1; ++i) {
            if (arr[i] > arr[i + 1]) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    /**
     * 使用二分查找
     * @param arr
     * @return
     */
    public int peakIndexInMountainArray2(int[] arr) {
        if (arr.length == 3) {
            return 1;
        }
        int left = 1, right = arr.length - 2;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid+1] && arr[mid] > arr[mid-1]) {
                left = mid + 1;
            }
            if (arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1]) {
                right = mid - 1;
            }
        }
        return left;
    }
}
