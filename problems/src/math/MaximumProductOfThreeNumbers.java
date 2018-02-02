import java.util.Arrays;

/**
 * Created by Orion on 01/2018
 * From LeetCode 628
 * Description:
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.
 *
 * Example 1:
 * Input: [1,2,3]
 * Output: 6
 *
 * Example 2:
 * Input: [1,2,3,4]
 * Output: 24
 *
 * Note:
 *     1.The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
 *     2.Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 */
public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]>=0) {
            return nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        }else{
            int a = nums[0]*nums[1]*nums[nums.length-1];
            int b = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
            if(a > b) {
                return a;
            }else{
                return b;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int res = new MaximumProductOfThreeNumbers().maximumProduct(nums);
        System.out.println(res);
    }
}
