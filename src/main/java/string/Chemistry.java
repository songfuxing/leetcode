package string;

import java.util.HashMap;
import java.util.Map;

/**
 * 统计一个化合物每一种元素的个数
 */
public class Chemistry {
    Map<String, Integer> result = new HashMap<String, Integer>();
    public Map<String, Integer> statistic(String chemistry) {
        core(chemistry,1);
        return result;
    }

    private void core(String subString, int count) {
        if (subString == null || subString.length() == 0) {
            return;
        }
        if (!subString.contains("(")) {
            statis(subString, count);
        } else {
            int firstIndex = subString.indexOf("("); // 第一个做括号
            int lastIndex = subString.lastIndexOf(")"); // 最后一个右括号
            int countIndex = lastIndex + 1; // 括号后面的数字
            String lastStr = subString.substring(countIndex + 1, subString.length());
            String firstStr = subString.substring(0, firstIndex);
            statis(firstStr + lastStr, count);
            int curCount = count * Integer.valueOf(subString.substring(countIndex, countIndex + 1));
            String sub = subString.substring(subString.indexOf("(") + 1, countIndex - 1);
            core(sub, curCount);
        }
    }

    private void statis(String str, int count) {
        int len = str.length();
        for(int i = 0; i < str.length();) {
            if (i + 1 < len && Character.isDigit(str.charAt(i + 1))) {
                String curStr = str.substring(i, i+1);
                int curCount = count * Integer.valueOf(str.substring(i + 1, i + 2));
                if (result.containsKey(curStr)) {
                    result.put(curStr, result.get(curStr) + curCount);
                } else {
                    result.put(curStr, curCount);
                }
                i += 2;
            } else {
                String curStr = str.substring(i, i + 1);
                int curCount = count;
                if (result.containsKey(curStr)) {
                    result.put(curStr, result.get(curStr) + curCount);
                } else {
                    result.put(curStr, curCount);
                }
                i++;
            }

        }
    }

    public static void main(String[] args) {
        String str = "H4O(H2C(C)2)2";
        Chemistry chemistry = new Chemistry();
        chemistry.statistic(str);
        System.out.println(chemistry.result);
    }
}
