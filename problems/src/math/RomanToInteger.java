import java.util.HashMap;
import java.util.Map;

/**
 * Created by Orion on 01/02/2018
 * From LeetCode 013
 * Description:
 * Given a roman numeral, convert it to an integer.
 * 
 * Input is guaranteed to be within the range from 1 to 3999.
 * Input: MCMVXIII
 * Output: 1908
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character,Integer> m = new HashMap<Character,Integer>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int sum=m.get(s.charAt(s.length()-1));
        for(int i=s.length()-1;i>0;i--){
            if(m.get(s.charAt(i))<=m.get(s.charAt(i-1))){
                sum+=m.get(s.charAt(i-1));
            }else{
                sum-=m.get(s.charAt(i-1));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "MCMVXIII";
        int res = new RomanToInteger().romanToInt(s);
        System.out.println(res);
    }
}
