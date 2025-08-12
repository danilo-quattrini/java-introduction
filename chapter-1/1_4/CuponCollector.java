/**<h1>1.4.2 Cupon Collection</h1>
 * This program takes an integer command-line argument n and simulates coupon  collection by
 * generating random numbers between 0 and n-1 until getting every possible value.
 * **/
public class CuponCollector {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isCollected = new boolean[n];
        int distinct = 0;
        int count = 0;
        while (distinct < n){
            int r = (int) (Math.random() * n);
            if(!isCollected[r]){
                isCollected[r] = true;
                distinct++;
            }
            count++;
        }
        System.out.println("Counter Value: " + count);
    }
}