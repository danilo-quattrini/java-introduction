/**<h1>1.3.32 Powers Of K</h1>
 * Write a program PowersOfK that takes an integer command-line argument
 * k and prints all the positive powers of k in the Java long data type. Note : The con-
 * stant Long.MAX_VALUE is the value of the largest integer in long.
 * **/
public class PowersOfK {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        long pow = 1;
        // Set a boundery on the part where we set up the Long.MAX_VALUE / k to avoid the loop
        while (pow <= Long.MAX_VALUE / k){
            System.out.println(pow);
            pow *= k;
        }
    }
}