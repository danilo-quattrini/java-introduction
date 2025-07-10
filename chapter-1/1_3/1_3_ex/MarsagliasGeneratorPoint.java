/**<h1>1.3.33 Marsaglia's Method</h1>
 * Write a program that prints the coordinates of a random point (a, b, c) on
 * the surface of a sphere. To generate such a point, use Marsaglia’s method: Start by
 * picking a random point (x, y) in the unit disk using the method described at the
 * end of this section.<br><br>
 * <i>N.B: The real Marsaglia's method is with b = 2 * y * Math.sqrt(...) in the book
 * there's a simplification of it without the y, so I did the real one.</i>
 * **/
public class MarsagliasGeneratorPoint {
    public static void main(String[] args) {
        // Generate the random point within -1 to 1
        double x,y;
        do{
             x = 2.0 * Math.random() - 1.0;
             y = 2.0 * Math.random() - 1.0;
        }while (x*x + y*y > 1.0);
        double sqrt = Math.sqrt(1 - (x * x) - (y * y));
        double a = 2 * x * sqrt;
        double b = 2 * y * sqrt;
        double c = 1 - 2 *((x*x) + (y*y));
        System.out.println("The generated random point into a sphere are");
        System.out.println("(" + a + "," + b + "," + c +")");
    }
}