public class ArrayTooBig {
    public static void main(String[] args) {
        int[] a = new int[1000];
        // We cannot access to the lastest elemnt of the array
        // we can only access to the element within [0, n - 1]
        a[1000] = 100;
        System.out.println(a[1000]);
    }
}