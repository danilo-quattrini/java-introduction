/**<h1>Sampling without replacement</h1>
 * This program takes two command-line arguments m and n and produces a sample of m of the
 * integers from 0 to n-1. This process is useful not just in state and local lotteries, but in scien-
 * tific applications of all sorts. If the first argument is equal to the second, the result is a random
 * permutation of the integers from 0 to n-1. If the first argument is greater than the second, the
 * program will terminate with an ArrayOutOfBoundsException.
 * **/
public class Sample {
    public static void main(String[] args) {
        // The first element we choose how many elemnts we want to sample
        int m = Integer.parseInt(args[0]);
        // We use the second variable to initialize the dimension of the array
        int n = Integer.parseInt(args[1]);
        // The array we are going to use for our samples
        int[] perm = new int[n];

        // We initialize the values inside the array from 0 to n - 1
        for (int i = 0; i < n; i++)
            perm[i] = i;

        // Now we use the shuffle method of before to choose from all the array the sample we randomly ger
        for (int i = 0; i < m; i++) {
            int r = (int) (Math.random() * (n - 1)); // r is the index of the value we want to get inside the array
            int temp = perm[i];
            perm[i] = perm[r]; // we assign the value we got randomly to the first position of the array
            perm[r] = temp;
        }

        // Now we print all the samples we got from the values of n and m
        for (int i = 0; i < m; i++)
            System.out.print(" " + perm[i]);

    }
}