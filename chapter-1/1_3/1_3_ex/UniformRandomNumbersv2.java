/**<h1>1.3.10 Uniform random numbers with personalized dimension.</h1>
 Write a program that takes an integer command-line argument n, uses
 Math.random() to print n uniform random values between 0 and 1, and then
 prints their average value (see EXERCISE 1.2.30).
 **/
public class UniformRandomNumbersv2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            double x = Math.random();
            System.out.print(" "+x);
            sum += x;
            min = Math.min(min,x); // if an x generate is smaller than the min, it will be substituted with x
            max = Math.max(max,x); // if an x generate is bigger than the max, it will be substituted with x
        }
        System.out.println();
        double avg = sum / 5.0;
        System.out.println("Average: "+ avg + " Max: "+ max + " Min: " + min);
    }
}