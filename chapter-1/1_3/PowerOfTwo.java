/**<h1>Program 1.3.3 Computing powers of 2</h1>
 * This program takes an integer command-line argument n and prints a table of the powers of 2
 * that are less than or equal to 2^n. Each time through the loop, it increments the value of i and
 * doubles the value of power. We show only the first three and the last three lines of the table; the
 * program prints n+1 lines.
 * <i>In this case I decided to add my personal number not only the twos, with the variable value</i>
 * */
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int value = 1;
        int i = 0;
        while(i <= n){
            System.out.println(i + " " + value);
            value *= 2;
            i = i + 1;
        }
    }
}