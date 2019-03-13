package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 判断有效括号
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Map<String, String> dict = new HashMap();
        dict.put("]","[");
        dict.put("}", "{");
        dict.put(")", "(");
        Stack<String> stack = new Stack();
        for (int i = 0; i < s.length(); i ++) {
            String c = s.substring(i, i+1);
            if (dict.containsKey(c)) {
                if (stack.isEmpty() || !stack.pop().equals(dict.get(c))) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "]";
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid(s));
    }
}
