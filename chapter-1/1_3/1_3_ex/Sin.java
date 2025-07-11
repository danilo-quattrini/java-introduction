public class Sin {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double sin = 0.0;
        double term = 1.0;
        for (int n = 1; sin != sin + term; n+=2) {
            double num = 1.0, den = 1.0;
            for (int i = 1; i <= n; i++)  num *= x;
            for (int i = 1; i <= n; i++)  den *= i;
            System.out.print(den + " ");
            System.out.print(num + " ");
            term = num / den;
            sin += term;
            System.out.println();
        }
        System.out.println("Math.sin(): " + Math.sin(x));
        System.out.println("sin x:" + sin);
    }
}