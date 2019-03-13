package string;

/**
 * 数字反转
 */
public class Reverse {
    public int reverse(int x) {
        int result = 0;
        while(x!=0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) /10 != result) {
                return 0;
            }
            x = x / 10;
            result = newResult;
        }
       return result;
    }
}
