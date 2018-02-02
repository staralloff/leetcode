/**
 * Created by Orion on 07/2017
 * From LeetCode 028
 * Description:
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 *
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 */
public class ImplementStr {
    public int strStr(String haystack, String needle) {
        int j = haystack.length()-needle.length();
        int res = 0;
        if(needle.length()>haystack.length()) {
            res = -1;
        }else{
            for(int i=0;i<=j;i++) {
                String substr=haystack.substring(i, i+needle.length());
                if(substr.equals(needle)) {
                    res = i;
                    break;
                }else{
                    res = -1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int res = new ImplementStr().strStr(haystack,needle);
        System.out.println(res);
    }
}

