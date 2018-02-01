/**
 * Created by Orion on 06/2017
 * From LeetCode 007
 * Description:
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output:  321
 *
 * Example 2:
 *
 * Input: -123
 * Output: -321
 *
 * Example 3:
 *
 * Input: 120
 * Output: 21
 */
public class ReverseInteger {
    public int reverse(int x) {
        int head = x/10;
        int tail = x%10;
        long re = 0;

        while(head!=0||tail!=0) {
            re = re*10 + tail;
            tail = head%10;
            head = head/10;
        }

        re = re < Integer.MIN_VALUE? 0:re;
        re = re > Integer.MAX_VALUE? 0:re;

        return (int)re;
    }

    public static void main(String[] args) {
        int x = 210;
        int res = new ReverseInteger().reverse(x);
        System.out.println(res);
    }
}

