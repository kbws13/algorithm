package xyz.kbws.BitreeBisearch.level2;

/**
 * @author kbws
 * @date 2024/1/14
 * @description:
 */
public class QuShiShuZi {
    public int missingNumber (int[] a) {
        int left = 0;
        int right = a.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(a[mid]==mid){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }
}
