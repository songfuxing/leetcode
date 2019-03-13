package string;

/**
 * 最长回文
 */
public class Parlindromic {
    public static void main(String[] args) {
        String s = "abbbbaaa";
        Parlindromic parlindromic = new Parlindromic();
        System.out.println(parlindromic.outerCircle(s));
    }

    private int left, maxPos;

    public String outerCircle(String s) {
        if (s == null || s.length() <= 0) {
            return s;
        }
        for (int i = 0 ;i < s.length(); i++ ) {
            i = findParlinFromCenter(s.toCharArray(), i);
        }
        return s.substring(left, left + maxPos + 1);
    }

    public int findParlinFromCenter(char[] c, int center) {
        int rightIndex = center;
        int leftIndex = center;
        while(rightIndex + 1 < c.length && c[rightIndex] == c[rightIndex + 1]) {
            rightIndex ++;
        }
        int temp = rightIndex;
        while(leftIndex > 0 && rightIndex + 1 < c.length && c[leftIndex - 1] == c[rightIndex + 1]) {
            rightIndex ++ ;
            leftIndex --;
        }
        if (rightIndex - leftIndex > maxPos) {
            maxPos = rightIndex - leftIndex;
            this.left = leftIndex;
        }
        return temp;
    }


}
