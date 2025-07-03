/**<h1>1.3.2 Better version of the Quadratic</h1>
 * Write a more general and more robust version of Quadratic (PROGRAM
 * 1.2.3) that prints the roots of the polynomial ax2 + bx + c, prints an appropriate
 * message if the discriminant is negative, and behaves appropriately (avoiding division by zero)
 * if a is zero
 */
public class StrongQuadratic {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if(a != 0){
            double discriminant = Math.sqrt((b * b) - (4.0 * a * c));
            System.out.println("Discriminant: " + discriminant);
            if(discriminant > 0){
                double positiveRoot = (-b + discriminant) / (2*a);
                double negativeRoot = (-b - discriminant) / (2*a);
                System.out.println("The root of " + a + "x^2  " + b + "x  " + c + " is");
                System.out.println("x1: " + positiveRoot + " x2: " + negativeRoot);
            }else if (discriminant == 0.0){
                double root = (-b + discriminant) / (2*a);
                System.out.println("The root of " + a + "x^2 + " + b + "x + " + c + " is");
                System.out.println("x: "+ root);
            } else if (discriminant < 0.0) {
                System.out.println("The root is an immaginare number");
            }
        }else System.out.println("No division by 0!");

    }
}
