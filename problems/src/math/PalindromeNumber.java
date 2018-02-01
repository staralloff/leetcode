import java.util.ArrayList;

/**
 * Created by Orion on 06/2017
 * From LeetCode 009
 * Description:
 * Determine whether an integer is a palindrome. Do this without extra space.
 * Input: 12321
 * Output: true
 * Input: 12345
 * Output: false
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        boolean res=true;
        if(x<0)
            res=false;
        ArrayList a=new ArrayList();
        int i=0;
        while(x>=10){
            a.add(i, x%10);
            x=x/10;
            i++;
        }
        a.add(i,x);
        int length=a.size()-1;
        int j=0;
        while(length-j>=1){
            if(a.get(j)==a.get(length)){
                j++;
                length--;
            }else{
                res=false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        boolean res;
        res = new PalindromeNumber().isPalindrome(12345);
        System.out.println(res);
    }
}
