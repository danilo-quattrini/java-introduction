public class EuclideanDistanceV2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] x = new double[n];
        double[] y = new double[n];
        // We save the square differences between the corresponding elements
        double diff;
        // Later we save the sum of the differences inside the sum
        double sum = 0.0;
        // Final result to print the Euclidean distance
        double eucResult;
        // Generate random values inside the arrays
        System.out.println("a\tb");
        for (int i = 0; i < n; i++) {
            x[i] = 1 + (Math.random() * 10);
            y[i] = 1 + (Math.random() * 10);
        }
        for (int i = 0; i < n; i++) {
            // squares of the differences between corresponding
            diff = Math.pow((x[i] - y[i]), 2.0);
            sum += diff;
        }
        // We finish with the square root of the sums we made before
        eucResult = Math.sqrt(sum);
        System.out.printf("\nThe Euclidean distance is: %.3f", eucResult);
    }
}