package sort;

/**
 * 快排
 */
public class QuickSort {

    private void core(int[] a, int q, int r) {
        if (q >= r) {
            return;
        }
        int p = partition(a, q, r);
        core(a, q, p - 1);
        core(a, p + 1, r);
    }

    private int partition(int[] a, int q, int r) {
        int value = a[r];
        int j = q, i = q;
        for(; j <= r; j++) {
            if (a[j] < value) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
            }
        }
        a[i] = value;
        return i;
    }

    public void sort(int[] a) {
        core(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int[] a = {4,2,3,5,6};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(a);
        for(int i: a) {
            System.out.println(i);
        }
    }
}
