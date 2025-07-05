/**<h1>Program 1.3.5 Harmonic numbers</h1>
 * This program takes an integer command-line argument n and computes the value of the nth
 * harmonic number. The value is known from mathematical analysis to be about ln(n) + 0.57721
 * for large n. Note that ln(1,000,000) + 0.57721 14.39272.
 * */
public class HarmonicNumbers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        System.out.print("H=(");
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
            System.out.print("1/" + i);
            if(i < n) System.out.print(" + ");// We avoid it to print a '+' at the end of the seq
        }
        System.out.print(")= " + sum);
    }
}