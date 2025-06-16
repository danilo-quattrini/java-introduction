/**
 * 1.2.26 Polar coordinates. Write a program that converts from Cartesian
 * to polar coordinates. Your program should accept two double commandline
 * arguments x and y and print the polar coordinates r and theta. Use the
 * method Math.atan2(y, x) to compute the arctangent value of y/x that is
 * in the range from -π to π.
 * */
public class PolarCoordinates {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        double theta = -Math.PI + Math.atan2(y,x) + Math.PI;
        System.out.println("r: "+ r +" theta: "+ theta);
    }
}