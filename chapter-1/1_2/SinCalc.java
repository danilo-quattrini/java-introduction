public class SinCalc {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        System.out.println("sin(2) + sin(3): "+ (Math.sin(2*t)+Math.sin(3*t)));
    }
}