package search;

/**
 * 二分查找
 */
public class ElementSearch {
    /**
     * 查找第一个出现的元素
     */
    public static int firstElementSearch(int[] a, int value) {
        if (a == null || a.length == 0) {
            return -1;
        }
        int high = a.length - 1;
        int low = 0;
        while(low <= high) {
            int mid = (high - low)/2 + low;
            if (a[mid] >= value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low < a.length && a[low] == value) {
            return low;
        }
        return -1;
    }

    /**
     * 查找最后一个元素
     * @param a
     * @param value
     * @return
     */
    public static int lastElementSearch(int[] a, int value) {
        int high = a.length - 1;
        int low = 0;
        while(low <= high) {
            int mid = (high - low) / 2 + low;
            if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (high >=0 && a[high] == value) {
            return  high;
        }
        return -1;
    }

    /**
     *  第一个大于给定元素的位置
     * @param a
     * @param value
     * @return
     */
    public static int firstBiggerElement(int[] a, int value) {
        int high = a.length - 1;
        int low = 0;
        while(low <= high) {
            int mid = (high - low) / 2 + low;
            if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low < a.length && a[low]> value) return low;
        return -1;
    }

    /**
     * 最后一个小于给定元素的值
     * @param a
     * @param value
     * @return
     */
    public static int lastSmallerElement(int[] a, int value) {
        int high = a.length - 1;
        int low = 0;
        while(low <= high) {
            int mid = (high - low) /2 + low;
            if (a[mid] > value) {
                high = mid - 1;
            } else {
                if (mid == a.length - 1 || a[mid+1] > value) return mid + 1;
                else low = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] a = {2,3,5,5,5,6,7,10,100};
        int value = 5;
        System.out.println(firstElementSearch(a, value));
        System.out.println(lastElementSearch(a, value));
        System.out.println(firstBiggerElement(a, value));
        System.out.println(lastSmallerElement(a, value));
    }
}
