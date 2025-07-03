/**<h1>1.3.8 Rewrite TenHellos </h1>
 * Rewrite TenHellos to make a program Hellos that takes the number of
 * lines to print as a command-line argument. You may assume that the argument is
 * less than 1000. Hint: Use i % 10 and i % 100 to determine when to use st, nd, rd, or
 * th for printing the ith Hello.
 * **/
public class TenHellosBetter {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if(n < 1000){
            for (int i = 1; i <= n; i++) {
                String suffix = "th";
                if(i % 100 == 11 || i % 100 == 12 || i % 100 == 13) suffix = "th";
                else if(i % 10 == 1) suffix = "st";
                else if (i % 10 == 2) suffix = "nd";
                else if (i % 10 == 3)   suffix = "rd";
                System.out.println(i + suffix + " Hello World!");
            }
        }else System.out.println("The variable is bigger than 1000,so it isn't possible to use!");
    }
}