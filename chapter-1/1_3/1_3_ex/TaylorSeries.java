public class TaylorSeries {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double e = 1 + x;
        double term = 1.0;
        for (int n = 2; e != e + term; n++) {
            double den = 1.0,num = 1.0;
            for (int i = 1; i <= n; i++) num *= x;
            for (int i = 1; i <= n; i++) den *= i;
            term = num / den;
            e +=  term;

        }
        System.out.println("My result: "+ e);
        System.out.println("Math.exp():" + Math.exp(x));
    }
}