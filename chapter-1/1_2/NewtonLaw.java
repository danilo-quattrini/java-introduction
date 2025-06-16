/*
1.2.16 A physics student gets unexpected results when using the code
double force = G * mass1 * mass2 / r * r;
to compute values according to the formula F = Gm1m2 r 2. Explain the problem
and correct the code.
* */
public class NewtonLaw {
    public static void main(String[] args) {
        double r = 6371000; // Distance from the earth's center in meters
        final double G = 6.67430e-11; // Gravitational constant
        double force = G * (Integer.parseInt(args[0])*Integer.parseInt(args[1]) / Math.pow(r,2));
        System.out.println(force);
    }
}