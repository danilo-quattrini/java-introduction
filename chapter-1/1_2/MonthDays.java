public class MonthDays {
    public static void main(String[] args) {
        int d, m;
        d = Integer.parseInt(args[0]);
        m = Integer.parseInt(args[1]);
        System.out.println((3 <= m) && (m <= 6) && (d == 20));
    }
}