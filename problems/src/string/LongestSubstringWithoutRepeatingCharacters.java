import java.util.HashMap;

/**
 * Created by Orion on 06/2017
 * From LeetCode 003
 * Description:
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 * Given "bbbbb", the answer is "b", with the length of 1.
 *
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s){
        if(s.length() == 0){
            return 0;
        }

        int max = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0,j=0; i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max, i+1-j);
        }
        return max;
    }

    public static void main(String[] args){
        String s = "heelldf";
        int max = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);
        System.out.println(max);
    }
}
