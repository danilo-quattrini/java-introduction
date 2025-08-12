/**
 * <h1>1.4.3 Sieve of Eratosthenes</h1>
 * This program takes an integer command-line argument n and computes the number of primes
 * less than or equal to n. To do so, it computes a boolean array with isPrime[i] set to true if
 * i is prime, and to false otherwise. First, it sets to true all array elements to indicate that no
 * numbers are initially known to be nonprime. Then it sets to false array elements correspond-
 * ing to indices that are known to be nonprime (multiples of known primes). If a[i] is still true
 * after all multiples of smaller primes have been set to false, then we know i to be prime. The
 * termination test in the second for loop is i <= n/i instead of the naive i <= n because any
 * number with no factor less than n/i has no factor greater than n/i, so we do not have to look
 * for such factors. This improvement makes it possible to run the program for large n.
 * **/
public class PrimeSieve {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];
        // We are gonna set all the values inside the array isPrime[] to true
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true; //  Indicating that no factors of any integer have yet been found.
        }
        // We use the same function to calculate the Factorial from a number
        for (int i = 2; i <= n / i ; i++) {
           if(isPrime[i]){
               for (int j = i; j <= n / j; j++) {
                   isPrime[i * j] = false;
                   System.out.print("isPrime["+ i +" * "+ j +"]:"+ (i * j) + " ");
               }
           }
        }
        System.out.println();
        // Counting how may prime we found
        int primes = 0;
        for (int i = 2; i <= n; i++)
            if (isPrime[i]) primes++;
        System.out.println("Numbers of prime of π(" + n + ") is : " + primes);
        // We print the factorial who it isn't divisable at the end
        // if(n > 1) System.out.println(n);
    }
}