/**<h1>Program 1.3.6 Newton’s method</h1>
 * This program takes a positive floating-point number c as a command-line argument and com-
 * putes the <i>>square root</i> of c to 15 decimal places of accuracy, using Newton’s method (see text).
 */
public class Sqrt {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        final double EPSILON = 1e-15;
        double x = a;
        while (Math.abs(x -  a/x) > (EPSILON * x)){
            x = (a/x + x) / 2.0;
        }
        System.out.println(x);
    }
}