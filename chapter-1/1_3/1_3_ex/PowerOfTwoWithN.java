/** <h1>1.3.16 Power of Two with limit of n</h1>
 * Write a program that takes an integer command-line argument n and
 * prints all the positive powers of 2 less than or equal to n. Make sure that your pro-
 * gram works properly for all values of n.
 * **/
public class PowerOfTwoWithN {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long pow = 1;
        while (pow <= n/2){
            pow *= 2;
            System.out.println(pow);
        }
    }
}