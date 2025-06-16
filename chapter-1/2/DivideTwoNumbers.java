public class DivideTwoNumbers {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int div = a / b;
        System.out.println((a == div) || (b == div));
    }
}