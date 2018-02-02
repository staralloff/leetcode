/**
 * Created by Orion on 07/2017
 * From LeetCode 026
 * Description:
 *  Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example:
 *
 * Given nums = [1,1,2],
 *
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int res=nums.length;
        for(int i=nums.length-1;i>=0;i--) {
            for(int j=i-1;j>=0;j--) {
                if(nums[i]==nums[j]) {
                    for(int k=j;k<nums.length-1;k++) {
                        nums[k]=nums[k+1];
                    }
                    res--;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int res = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        System.out.println(res);
    }
}

