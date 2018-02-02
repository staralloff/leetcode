/**
 * Created by Orion on 01/2018
 * From LeetCode 598
 * Description:
 * Given an m * n matrix M initialized with all 0's and several update operations.
 *
 * Operations are represented by a 2D array, and each operation is represented by an array with two positive integers a and b, which means M[i][j] should be added by one for all 0 <= i < a and 0 <= j < b.
 *
 * You need to count and return the number of maximum integers in the matrix after performing all the operations.
 *
 * Example 1:
 * Input: 
 * m = 3, n = 3
 * operations = [[2,2],[3,3]]
 * Output: 4
 *
 * Note:
 *     1.The range of m and n is [1,40000].
 *     2.The range of a is [1,m], and the range of b is [1,n].
 *     3.The range of operations size won't exceed 10000.
 */
public class RangeAdditionII {
    public int maxCount(int m, int n, int[][] ops) {
        int count = 0;
        int[][] res = new int[m][n];
        for(int k=0;k<ops.length;k++){
            for(int i=0;i<ops[k][0];i++){
                for(int j=0;j<ops[k][1];j++){
                    res[i][j]+=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(res[i][j]==res[0][0])
                    count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int m = 3;int n = 3;
        int[][] ops = {{2,2},{3,3}};
        int count = new RangeAdditionII().maxCount(m,n,ops);
        System.out.println(count);
    }
}
