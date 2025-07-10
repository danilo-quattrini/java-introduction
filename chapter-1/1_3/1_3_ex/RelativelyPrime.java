/**<h1>1.3.31 RelativelyPrime</h1>
 * Write a program RelativelyPrime that takes an integer command-line
 * argument n and prints an n-by-n table such that there is an * in row i and column
 * j if the gcd of i and j is 1 (i and j are relatively prime) and a space in that position
 * otherwise.
 * **/
public class RelativelyPrime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.print(" ");
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= n; j++) {
                int x = i;
                int y =  j;
                // We are inverting the y with the value of x and following the rule of the GCD
                if(y > x){
                    int temp = x;
                    x = y;
                    y = temp;
                }
                while (y != 0){
                   int remainder = x % y;
                   x = y;
                   y = remainder;
                }
                System.out.print(x == 1 ? "* " : " "); // instead of using if-else statement
                // just use one-line System.out.print(<condition> ? true : false);
            }
            System.out.println();
        }
    }
}