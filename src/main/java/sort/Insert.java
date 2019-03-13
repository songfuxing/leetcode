package sort;

/**
 * 插入排序
 */
public class Insert {
    public static void insert(int[] a) {
        if (a == null|| a.length == 0) {
            return;
        }
        int n = a.length;
        for(int i = 1; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for(;j >= 0; j --) {
                if(value < a[j]) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,2,1};
        insert(a);
        Bubble.print(a);
    }
}
