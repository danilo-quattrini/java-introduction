public class ReverseOrder {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = a.length;
        System.out.println("Before the revers");
        for (int i = 0; i < n ; i++) System.out.print(" " +  a[i]);
        for (int i = 0; i < n; i++) {
            int temp = a[n-1];
            a[n - 1] = a[i];
            a[i] = temp;
            n--;
        }
        System.out.println();
        System.out.println("After the revers");
        for (int i = 0; i < n; i++) System.out.print(" " +  a[i]);
    }
}