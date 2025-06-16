/*
1.2.18 Write a program that takes two integer command-line arguments x and y
and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
* */
public class EuclideanDistance {
    public static void main(String[] args) {
        int x,y,o1,o2;
        double d;
        o1 = o2 = 0;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        d = Math.sqrt(Math.pow((o1-x),2)+Math.pow((o2-y),2));
        System.out.println(d);
    }
}