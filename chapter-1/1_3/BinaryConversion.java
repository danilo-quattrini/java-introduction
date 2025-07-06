/**<h1>Program 1.3.7 Converting to binary</h1>
 * This program takes a positive integer n as a command-line argument and prints the binary
 * representation of n by casting out powers of 2 in decreasing order.
 * In this case the program is like a weight, if the value of the pow is
 * bigger than the number we are converting, we ignore the value, whereas in
 * the case that the value of d is smaller than the pow, is the right pow, so we are
 * going to save the pow with 1 and decrease the number to evaluate the next one.
 * **/
public class BinaryConversion {
    public static void main(String[] args) {
        int d = Integer.parseInt(args[0]);
        int pow = 1;
        while (pow <= (d/2)) // Here I'm getting the biggest pow of 2;
            pow *= 2;
        while (pow > 0){
            if(d < pow) System.out.print("0");
            else { System.out.print("1"); d -= pow;}
            pow /= 2; // Divided by two for each value, even if is 0 at the end;
        }
    }
}