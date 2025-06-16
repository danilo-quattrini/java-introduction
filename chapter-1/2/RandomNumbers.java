public class RandomNumbers {
    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(args[1]);
        b = Integer.parseInt(args[0]);
        System.out.println(b + (int)(Math.random() * ((a-b) + 1)));
        System.out.println(b + (int)(Math.random() * ((a-b) + 1)));
        System.out.println(b + (int)(Math.random() * ((a-b) + 1)));
    }
}