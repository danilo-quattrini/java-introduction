/**1.2.29 Day of the week. Write a program that takes a date as input and prints the
 day of the week that date falls on. Your program should accept three int command-
 line arguments: m (month), d (day), and y (year). For m, use 1 for January, 2 for
 February, and so forth. For output, print 0 for Sunday, 1 for Monday, 2 for Tuesday,
 and so forth. Use the following formulas, for the Gregorian calendar:
 <ul>y0 = y - (14 - m) / 12</ul>
 <ul>x = y0 + y0 / 4 - y0 / 100 + y0 / 400</ul>
 <ul>m0 = m + 12 * ((14 - m) / 12) - 2</ul>
 <ul>d0 = (d + x + (31 * m0) / 12) % 7</ul>
 * */
public class DayOfWeek {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year
        if((m >= 1 && m <= 12) && (d >= 1 && d <= 31)){
            int y0 = y - (14 - m) / 12;
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            int m0 = m + 12 * ((14 - m) / 12) - 2;
            int d0 = (d + x + (31 * m0) / 12) % 7;
            System.out.println("The day is "+ d0);
        }
    }
}