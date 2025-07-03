/**<h1>1.3.1 Three Equal Numbers</h1>
 * Write a program that takes three integer command-line arguments and
 * prints equal if all three are equal, and not equal otherwise.
 * **/
public class ThreeEqualNumbers {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // if statement that check if a is equal to b and if yes check either if b is equal to c too
        if(a == b && b == c) System.out.println(true);
        System.out.println(false);
    }
}