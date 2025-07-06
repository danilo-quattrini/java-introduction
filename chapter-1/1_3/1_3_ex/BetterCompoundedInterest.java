/**<h1>1.3.17 Better Compounded Interest</h1>
 * Expand your solution to EXERCISE 1.2.24 to print a table giving the total
 * amount of money you would have after t years for t = 0 to 25.
 * **/
public class BetterCompoundedInterest {
    public static void main(String[] args) {
        double r = (1.2/100); // Interest
        double P = 20; //Dollars we got.
        double e = (1 + r);
        System.out.println("Money\tYear\tInterest\tTotal");
        for (int t = 1; t <= 25; t++) {
            String suffix;
            if(t % 100 == 11 || t % 100 == 12 || t % 100 == 13) suffix = "th";
            else if(t % 10 == 1) suffix = "st";
            else if(t % 10 == 2) suffix = "nd";
            else if(t % 10 == 3) suffix = "rd";
            else suffix = "th";
            System.out.print(P+"$\t");
            System.out.print(t+suffix+"\t");
            System.out.print((r*100)+"%\t");
            double total = P * Math.pow(e,t);
            System.out.print(total+"$\t");
            System.out.println();
        }
        int n = 10;
        double sum = 0.0;
        double sum1 = 0.0;
        for (int i = 1; i <= n; i++){
            sum += 1 / (1.0 * i * i);
            sum1 += 1.0 / (i * i);
            System.out.print(sum + " ");
            System.out.print(sum1 + " ");
            System.out.println();
        }

    }
}