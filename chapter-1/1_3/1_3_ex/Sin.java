/**<h1>1.3.39 Sin and Cos</h1>
 * Trigonometric functions. Write two programs, Sin and Cos, that
 * compute the sine and cosine functions using their Taylor series expansions
 * **/
public class Sin {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double sin = 0.0;
        double term = 1.0;
        int sign = 1; // Positive sign inside the Taylor Sequence
        for (int n = 1; sin != sin + term; n+=2) {
            term = 1.0;
            for (int i = 1; i <= n; i++) term *= x / i;
            term *= sign; // Give the sign to the term variable in base of the position inside the sequence
            sin += term;
            sign *= -1; // The next sign it would be negative as the rule says
        }
        System.out.println("Math.sin(): " + Math.sin(x));
        System.out.println("sin x:" +  sin);
    }
}