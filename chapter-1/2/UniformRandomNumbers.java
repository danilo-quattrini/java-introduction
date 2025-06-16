/**<h1>1.2.30 Uniform random numbers.</h1>
 *  Write a program that prints five
 * uniform radom numbers between 0 and 1, their average value,
 * and their minimum and maximum values. Use Math.random(), Math.min(), and Math.max().
**/
public class UniformRandomNumbers {
    public static void main(String[] args) {
        double sum = 0.0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
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