package search;

/**
 * 循环递增的有序数组，查找最小的数
 */
public class CircleSortedString {
    public static int search(int[] a) {
        if (a == null || a.length <= 0) {
            return -1;
        }
        int max = a.length - 1;
        int min = 0;
        while( max >= min) {
            int mid = min + (max - min)/2;
            if (mid - 1 >= min && a[mid - 1] > a[mid] ) {
                return mid;
            } else if (mid + 1 <= max && a[mid + 1] < a[mid]){
                return mid + 1;
            }
            if (a[mid] < a[min]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2,3};
        int result = search(a);
        if (result == -1) {
            System.out.println("null");
        }
        else {
            System.out.println(a[result]);
        }
    }

}
