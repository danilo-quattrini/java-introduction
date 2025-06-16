public class CosSin{
    public static void main(String[] args){
        double cos = Math.cos(Double.parseDouble(args[0]));
        double sin = Math.sin(Double.parseDouble(args[0]));
        System.out.println("cos^2+sin^2 = " + (Math.pow(cos,2.0) + Math.pow(sin,2.0)));
    }
}