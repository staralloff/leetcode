import java.util.Arrays;

/**
 * Created by Orion on 01/2018
 * From LeetCode 593
 * Description:
 * Given the coordinates of four points in 2D space, return whether the four points could construct a square.
 *
 * The coordinate (x,y) of a point is represented by an integer array with two integers.
 *
 * Example:
 * Input: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,1]
 * Output: True
 *
 * Note:
 *     1.All the input integers are in the range [-10000, 10000].
 *     2.A valid square has four equal sides with positive length and four equal angles (90-degree angles).
 *     3.Input points have no order.
 */
public class ValidSquare {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        double l1 = length(p1,p2);
        double l2 = length(p1,p3);
        double l3 = length(p1,p4);
        double l4 = length(p2,p3);
        double l5 = length(p2,p4);
        double l6 = length(p3,p4);
        double[] a = {l1,l2,l3,l4,l5,l6};
        Arrays.sort(a);
        if(a[0]!=0&&a[1]!=0&&a[2]!=0&&a[3]!=0){
            if(a[0]==a[1]&&a[0]==a[2]&&a[0]==a[3]&&a[4]==a[5]){
                return true;
            }
        }
        return false;
    }

    public double length(int[] a, int[] b) {
        return Math.sqrt((b[0]-a[0])*(b[0]-a[0])+(b[1]-a[1])*(b[1]-a[1]));
    }

    public static void main(String[] args) {
        int[] p1 = {0,0};
        int[] p2 = {0,1};
        int[] p3 = {1,0};
        int[] p4 = {1,1};
        boolean res = new ValidSquare().validSquare(p1,p2,p3,p4);
        System.out.println(res);
    }
}

