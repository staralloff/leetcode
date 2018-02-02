/**
 * Created by Orion on 07/2017
 * From LeetCode 035
 * Description:
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Example 1:
 * Input: [1,3,5,6], 5
 * Output: 2
 *
 * Example 2:
 * Input: [1,3,5,6], 2
 * Output: 1
 *
 * Example 3:
 * Input: [1,3,5,6], 7
 * Output: 4
 *
 * Example 4:
 * Input: [1,3,5,6], 0
 * Output: 0
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int res=0;
        boolean flag=true;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==target) {
                res=i;
                flag=false;
            }
        }
        if(flag==true) {
            if(target<nums[0]) {
                res=0;
            }else if(target>nums[nums.length-1]) {
                res=nums.length;
            }else{
                for(int j=0;j<nums.length;j++) {
                    if(target<nums[j]) {
                        res=j;
                        break;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int res = new SearchInsertPosition().searchInsert(nums,target);
        System.out.println(res);
    }
}

