/*
1.2.15 Write a program that takes three positive integers as command-line
arguments and prints false if any one of them is greater than or equal to the sum
of the other two and true otherwise. (Note : This computation tests whether the
three numbers could be the lengths of the sides of some triangle.)
* */
public class CheckThreeValues {
    public static void main(String[] args) {
        int a,b,c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        System.out.println((a <= (b + c)) && (b <= (a + c)) && (c <= (b + a)));
    }
}