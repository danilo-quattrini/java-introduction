public class Cos {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double cos = 0.0;
        double term = 1.0;
        int sign = 1;
        for (int n = 0; cos != cos + term; n+=2) {
            term = 1.0;
            for (int i = 1; i <= n; i++) term *= x / i;
            term *= sign;
            cos += term;
            sign *= -1;
        }
        System.out.println(Math.cos(x) + " ");
        System.out.println(cos + " ");
    }
}