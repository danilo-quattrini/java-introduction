/*** <h1>1.3.19 Square Root With Check</h1>
 * Show that PROGRAM 1.3.6 implements Newton’s method for finding the
 * square root of c.
 * */
public class SqrtWithNewton {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]); // The number we want to do the square root
        if(c > -0.0){
            final double EPSILON = 1.0e-15; // Define the accuracy of the calculation
            double t = c; //Initial estimate that is t0 the function is f(t) = t^2 - c where t^2 - c = 0
            System.out.println("xn+1");
            while(Math.abs(t - (c/t)) > EPSILON * t){
                t = (t + (c/t))/2;
                System.out.println(t);
            }
        }else System.out.println("The square root of a neg number is not possible");
    }
}