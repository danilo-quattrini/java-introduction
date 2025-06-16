/**<h1>1.2.34 Three-sort.</h1>
 * Write a program that takes three integer command-line
 * arguments and prints them in ascending order. Use {@code Math.min()} and {@code Math.max()}.
 * **/
public class ThreeSort {
    public static void main(String[] args) {
        int x,y,z;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        z = Integer.parseInt(args[2]);
        int bigger = Math.max(x, Math.max(y, z));
        int smaller = Math.min(x, Math.min(y, z));
        int medium = (x + y + z) - bigger - smaller;
        System.out.println(bigger + " > " + medium + " > " + smaller);

    }
}