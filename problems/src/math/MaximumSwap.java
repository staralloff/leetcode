import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Orion on 12/2017
 * From LeetCode 670
 * Description:
 *  Given a non-negative integer, you could swap two digits at most once to get the maximum valued number. Return the maximum valued number you could get.
 *
 * Example 1:
 * Input: 2736
 * Output: 7236
 * Explanation: Swap the number 2 and the number 7.
 *
 * Example 2:
 * Input: 9973
 * Output: 9973
 * Explanation: No swap.
 *
 * Note:
 *     1.The given number is in the range [0, 108]
 */
public class MaximumSwap {
    public int maximumSwap(int num) {
        int maxSeen = 0, maxIdx = -1, power = 0, swapIdx1 = 0, swapIdx2 = 0;
        List<Integer> list = new ArrayList<>();
        while(num > 0) {
            int digit = num%10;
            list.add(digit);
            if(maxSeen > digit) {
                swapIdx1 = power;
                swapIdx2 = maxIdx;
            }else if(digit > maxSeen) {
                maxSeen = digit;
                maxIdx = power;
            }
            num = num/10;
            power++;
        }

        Collections.swap(list, swapIdx1, swapIdx2);

        int result = 0;
        for(int i=0;i<list.size();i++){
            result+=(int)(Math.pow(10,i)*list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 2736;
        int res = new MaximumSwap().maximumSwap(num);
        System.out.println(res);
    }
}

