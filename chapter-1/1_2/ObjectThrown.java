/*
* 1.2.22 Write a program that takes three double command-line arguments x0, v0,
and t and prints the value of x0 v0t − g t 2 2, where g is the constant 9.80665. (Note :
This value is the displacement in meters after t seconds when an object is thrown
straight up from initial position x0 at velocity v0 meters per second.)
* */
public class ObjectThrown {
    public static void main(String[] args) {
        double x,v,t;
        final double g = 9.80665;
        x = Double.parseDouble(args[0]);
        v = Double.parseDouble(args[1]);
        t = Double.parseDouble(args[2]);
        System.out.println(((g*Math.pow(t,2))/2));
        System.out.println((x+(v*t))-((g*Math.pow(t,2))/2));
    }
}