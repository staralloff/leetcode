import java.util.Arrays;

/**
 * Created by Orion on 12/2017
 * From LeetCode 645
 * Description:
 *  The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, which results in repetition of one number and loss of another number.
 *
 * Given an array nums representing the data status of this set after the error. Your task is to firstly find the number occurs twice and then find the number that is missing. Return them in the form of an array.
 *
 * Example 1:
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 *
 * Note:
 *     1.The given array size will in the range [2, 10000].
 *     2.The given array's numbers won't have any order.
 */
public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[2];
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]==nums[i+1]) {
                res[0]=nums[i];
            }
        }
        for(int j=1;j<=nums.length;j++) {
            if(Arrays.binarySearch(nums,j)<0) {
                res[1]=j;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] res = new SetMismatch().findErrorNums(nums);
        System.out.println("{"+res[0]+","+res[1]+"}");
    }
}

