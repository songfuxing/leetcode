package sort;

/**
 * 冒泡
 */
public class Bubble {
    public static void sortAsc(int a[]){
        if (a == null || a.length == 0) {
            return;
        }
        for (int i = 0; i < a.length; i ++) {
            for(int j = 0; j < a.length - i - 1; j ++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {1,4,3,2,4,5};
        sortAsc(a);
        print(a);
    }

    public static void print(int[] a) {
        for(int i: a) {
            System.out.println(i);
        }
    }
}
