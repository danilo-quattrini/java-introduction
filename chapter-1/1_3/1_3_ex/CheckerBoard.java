/**<h1>1.3.29 Checkerboard</h1>
 * Write a program Checkerboard that takes an integer command-line argu-
 * ment n and uses a loop nested within a loop to print out a two-dimensional n-by-n
 * checkerboard pattern with alternating spaces and asterisks.
 * **/
public class CheckerBoard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}