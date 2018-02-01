import java.util.Stack;

/**
 * Created by Orion on 06/2017
 * From LeetCode 020
 * Description:
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='(') {
                st.push(')');
            }else if(s.charAt(i)=='[') {
                st.push(']');
            }else if(s.charAt(i)=='{') {
                st.push('}');
            }else if(st.isEmpty()||st.pop()!=s.charAt(i)) {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        boolean res = new ValidParentheses().isValid(s);
        System.out.println(res);
    }
}
