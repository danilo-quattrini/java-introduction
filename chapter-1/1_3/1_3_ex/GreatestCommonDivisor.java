/**<h1>1.3.30 GreatestCommonDivisor</h1>
 * Write a program GreatestCommonDivisor that finds the greatest common
 * divisor (gcd) of two integers using Euclid’s algorithm, which is an iterative compu-
 * tation based on the following observation: if x is greater than y, then if y divides x,
 * the gcd of x and y is y; otherwise, the gcd of x and y is the same as the gcd of x % y
 * and y.
 * **/
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        // Check if y is bigger than x and we switch their values
        if(y > x){
            int temp = x; // N.B use temp variable to save middle values!!!
            x = y;
            y = temp;
        }
        // Now we are using the Euclidian's Algorithm GCD(x,y) = GCD(y, x mod y)
        System.out.println("remainder\tx\ty");
        while (y != 0){
            int remainder = x % y;
            System.out.print(remainder + "\t\t" + x + "\t" + y);
            x = y;
            y = remainder;
            System.out.println();
        }
        // The value that is the GCD is the X we assigned in line 23 that is the common divisor
        System.out.println("gcd: " + x);
    }
}