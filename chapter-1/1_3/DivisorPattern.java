/**<h1>Program 1.3.4 Your first nested loops</h1>
 * This program takes an integer command-line argument n and uses nested for loops to print
 * an n-by-n table with an asterisk in row i and column j if either i divides j or j divides i. The
 * loop control variables i and j control the computation.
 * **/
public class DivisorPattern {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // We just print the numbers that are divisors of 1 to n
        for (int i = 1; i <= n; i++) System.out.print(i + " ");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if((i % j == 0) || (j % i == 0))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(i);
        }
    }
}