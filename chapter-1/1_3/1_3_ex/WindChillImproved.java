/** <h1>1.3.6 Wind Chill Improved</h1>
 * Improve your solution to EXERCISE 1.2.25 by adding code to check that the
 * values of the command-line arguments fall within the ranges of validity of the formula,
 * and by also adding code to print out an error message if that is not the case.
 * **/
public class WindChillImproved {
    public static void main(String[] args) {
        double T = Double.parseDouble(args[0]); // Temperature in Fahrenheit
        double v = Double.parseDouble(args[1]); // Wind speed miles*hours
        if((T <= 50.0 && T >= -50.0) && (v <= 120 && v >= 3)){
            double w = 35.74 + (0.6215*T) + ((0.4275*T) - 35.75)*Math.pow(v,0.16);
            System.out.println("Wind Chill is: "+ w);
        }else System.out.println("The value of the Temperature or the Wind speed is incorrect");
    }
}