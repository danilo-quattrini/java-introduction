/**<h1>1.3.43 Median-of-5.</h1>
 * Write a program that takes five distinct integers as command-
 * line arguments and prints the median value (the value such that two of the other
 * integers are smaller and two are larger). Extra credit: Solve the problem with a
 * program that compares values fewer than 7 times for any given input.
 * **/
public class MedianOf5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        int temp;
            // We assign the biggest value
            if(a > c){
                temp = a;
                a = c;
                c = temp;
            }
            if(b > c) {
                temp = c;
                c = b;
                b = temp;
            }
            if(c > d){
                temp = d;
                d = c;
                c = temp;
            }
            if(c > e){
                temp = e;
                e = c;
                c = temp;
            }
        System.out.println("Median is: " + c);
        System.out.println("a: " + a +" b: "+  b + " c: " + c + " d: " + d + " e: " + e);
    }
}