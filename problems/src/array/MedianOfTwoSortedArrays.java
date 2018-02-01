/**
 * Created by Orion on 06/2017
 * From LeetCode 004
 * Description:
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * Example 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * The median is 2.0
 *
 * Example 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * The median is (2 + 3)/2 = 2.5
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = getArraySort(nums1,nums2);
        if(result.length%2==1){
            return result[result.length/2];
        }else{
            return (result[result.length/2]+result[result.length/2-1])/2.0;
        }
    }

    public int[] getArraySort(int[] m, int[] n) {
        int im = 0;
        int jn = 0;
        int[] mn = new int[m.length + n.length];

        while(im < m.length && jn < n.length) {
            if(m[im]<=n[jn]) {
                mn[im + jn] = m[im];
                im++;
            }else{
                mn[im + jn] = n[jn];
                jn++;
            }
        }
        //其中一个数组最后的元素值小于第二个数组的某个元素值，遍历第二个数组剩余元素值加入新数组
        while(im < m.length) {
            mn[im + jn] = m[im];
            im++;
        }
        while(jn < n.length) {
            mn[im +jn] = n[jn];
            jn++;
        }
        return mn;
    }

    public static void main(String[] args){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double res = new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1,nums2);
        System.out.println(res);
    }
}
