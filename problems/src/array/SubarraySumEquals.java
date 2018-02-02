/**
 * Created by Orion on 12/2017
 * From LeetCode 560
 * Description:
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 *
 * Example 1:
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 *
 * Note:
 *     1.The length of the array is in range [1, 20,000].
 *     2.The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */
public class SubarraySumEquals {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0;i <= nums.length;i++) {
            int sum = 0;
            for(int j = i;j < nums.length;j++) {
                sum+=nums[j];
                if(sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        int res = new SubarraySumEquals().subarraySum(nums,k);
        System.out.println(res);
    }
}
