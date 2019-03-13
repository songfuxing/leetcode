package sort;

/**
 * 归并排序
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] a = {2,3,4,5,3,1,1};
        MergeSort sort = new MergeSort();
        sort.sort(a);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    private void sort(int[] a) {
        mergeCore(a, 0, a.length - 1);
    }

    private void mergeCore(int[] a, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int mid = (begin + end) / 2;
        mergeCore(a, begin, mid);
        mergeCore(a, mid + 1, end);
        merge(a, begin, mid, end);
    }

    private void merge(int[] a, int begin, int mid, int end) {
        int i = begin;
        int j = mid + 1;
        int[] tmp = new int[end - begin + 1];
        int index = 0;
        while(i <= mid && j <= end) {
            if (a[i] <= a[j]) {
                tmp[index++] = a[i];
                i++;
            } else {
                tmp[index++] = a[j];
                j++;
            }
        }
        int start = i , last = mid;
        if (j <= end) {
            start = j;
            last = end;
        }
        while(start <= last) {
            tmp[index++] = a[start++];
        }

        for(int t = begin; t <= end; t++) {
            a[t] = tmp[t - begin ];
        }
    }
}
