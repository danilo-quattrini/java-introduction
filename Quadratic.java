public class Quadratic {
    public static  void main(String[] args){
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        System.out.println("x^2 " + b + "x "+ c);
        double discriminant = Math.sqrt(b * b - 4.0*c);
        System.out.println((-b + discriminant) / 2.0);
        System.out.println((-b - discriminant) / 2.0);
    }
}
