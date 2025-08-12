/** <h1>1.4 Examples of arrays usage</h1>
 * We are going to declare for the first time an array of dimension <i>n</i>,
 * first of all we are going to create the array with the <type> of the array we
 * are going to use.
 * <ul>Create the array: int[] a;</ul>
 * **/
public class Arrays {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a;
        a = new int[n];
        // Another way to initialize the array is with this one line way.
        double[] b = new double[n];
        // Assign the values inside the array
        for (int i = 0; i < n; i++)
            a[i] = (int) (1 + Math.random() * 10); // random values from 1 to 10 with Math.random() function

        // Print the values inside the array
        for (int i = 0; i < n; i++)
            System.out.print(" " + a[i]);

        // Find the max of a set of random numbers inside the array
        double max = Double.NEGATIVE_INFINITY;
        // We generate the randoms values inside the array
        for (int i = 0; i < n; i++) {
            b[i] = Math.random();
            System.out.println(" " + b[i]);
        }
        // Now we use another for-i loop to find the max value
        for (int i = 0; i < n; i++)
            if(max < b[i]) max = b[i]; // we check if the b[i] value is bigger than the mx than is the new max inside the set
        System.out.println("\nMax inside the set, it's: " + max);
    }
}