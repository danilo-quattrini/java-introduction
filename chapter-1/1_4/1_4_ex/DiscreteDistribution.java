/**<h1>1.4.12 Discrete Distribution</h1>
 * Write a program DiscreteDistribution that takes a variable number of
 * integer command-line arguments and prints the integer i with probability propor-
 * tional to the ith command-line argument.
 * **/
public class DiscreteDistribution {
    public static void main(String[] args) {
        int weight = 0;
        double[] probability = new double[args.length];
        for (int i =  0 ; i < args.length; i++) {
            weight += Integer.parseInt(args[i]);
        }
        for (int i = 0; i < args.length; i++) {
            probability[i] = (double) Integer.parseInt(args[i]) / weight;
            System.out.println("Probability to print " + Integer.parseInt(args[i]) + " is: " + (probability[i] * 100) / args.length);
        }
    }
}