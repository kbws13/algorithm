package xyz.kbws.Quicksort.level3;

import java.util.Arrays;

/**
 * @author kbws
 * @date 2024/1/15
 * @description:
 */
public class MergeSort {
    public static void mergeSort(int[] array, int start, int end, int[] temp) {
        if (start >= end) {
            return;
        }
        mergeSort(array, start, (start + end) / 2, temp);
        mergeSort(array, (start + end) / 2 + 1, end, temp);
        merge(array, start, end, temp);
    }

    public static void merge(int[] array, int start, int end, int[] temp) {
        int mid = (start + end) / 2;
        int left = start;
        int right = mid + 1;
        int index = left;
        while (left <= mid && right <= end) {
            if (array[left] < array[right]) {
                temp[index++] = array[left++];
            }else {
                temp[index++] = array[right++];
            }
        }
        while (left <= mid) {
            temp[index++] = array[left++];
        }
        while (right <= end) {
            temp[index++] = array[right++];
        }
        for (int i = start; i <= end; i++) {
            array[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 3, 2, 1, 4, 5, 8, 7};
        int[] temp = new int[array.length];
        mergeSort(array, 0, array.length - 1, temp);
        System.out.println(Arrays.toString(array));
    }
}
