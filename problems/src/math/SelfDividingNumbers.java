import java.util.List;
import java.util.ArrayList;

/**
 * Created by Orion on 12/2017
 * From LeetCode 728
 * Description:
 *  A self-dividing number is a number that is divisible by every digit it contains.
 *
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 *
 * Also, a self-dividing number is not allowed to contain the digit zero.
 *
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 *
 * Example 1:
 * Input: 
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 *
 * Note:
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 */
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for(Integer i = left;i <= right;i++) {
            switch(i.toString().length()) {
            case 1:
                if(i%i==0)
                    list.add(i);
            case 2:
                if(i/10!=0&&i%10!=0) {
                    if(i%(i/10)==0&&i%(i%10)==0)
                        list.add(i);
                }
            case 3:
                if(i/100!=0&&(i/10)%10!=0&&i%10!=0) {
                    if(i%(i/100)==0&&((i/10)%10)==0&&i%(i%10)==0)
                        list.add(i);
                }
            case 4:
                if(i/1000!=0&&(i/100)%10!=0&&(i%100)/10!=0&&i%10!=0) {
                    if(i%(i/1000)==0&&i%((i/100)%10)==0&&i%((i%100)/10)==0&&i%(i%10)==0)
                        list.add(i);
                }
            default:
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        List<Integer> list = new SelfDividingNumbers().selfDividingNumbers(left,right);
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}
