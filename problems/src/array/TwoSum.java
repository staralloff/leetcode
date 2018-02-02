/**
 * Created by Orion on 06/2017.
 * From LeetCode 001
 * Description:
 * Given an array of integers, return indices of the two numbers such that they  * add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1]
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]+nums[j]==target) {
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] res = new TwoSum().twoSum(nums, 9);
        for(int i:res)
            System.out.println(i);
    }
}
