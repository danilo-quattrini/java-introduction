/**<h1>1.3.20 Newton's Method with K and N</h1>
 * Using Newton’s method, develop a program that takes two integer com-
 * mand-line arguments n and k and prints the kth root of n (Hint: See EXERCISE 1.3.19).
 * **/
public class SqrtWithKandN {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        double k = Double.parseDouble(args[1]);
        if(n > -0.0){
            final double EPSILON = 1.0e-15; // Define the precision of the square root
            double t = n; //Defining the guessing number
            // We use the same formula, we substitute the f(x) = x^2 - c to f(x) = x^n - c
            while (Math.abs(t - ( (k - 1) * t + n / Math.pow(t, k - 1) ) / k) > EPSILON * t){
                t = ( (k-1) * t + (n / (Math.pow(t,(k-1))) ) )/k;
                System.out.println(t);
            }
            System.out.println("The square root of the number "+ n +" of the " + k +"th value is " + t);
        }else System.out.println("The square root of a neg number is not possible!");
    }
}