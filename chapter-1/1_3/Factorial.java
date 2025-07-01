/**<h1>Program 1.3.9 Factoring integers</h1>
 * This program takes a positive integer n as a command-line argument and prints the prime
 * factorization of n. The code is simple, but in this case I didn't follow the book algorithm
 * but I used the while cycle.
 * **/
public class Factorial {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int divisor = 2;
        // If we don't find the divisor of the number(n) we are incrementing the variable divisor, until we found it
        while (divisor <= n / divisor){
            // We divide the number in the way that we take all the 2 necessary to factorize n
            while ((n % divisor) == 0){
                n /= divisor; // we say that the number is a multiple of 2, so we reduce its amount
                System.out.print(divisor + " ");
            }
            divisor++;
        }
        if (n > 1) System.out.println(n);
        System.out.println();
    }
}