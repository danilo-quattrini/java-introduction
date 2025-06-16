/**
1.2.24 Continuously compounded interest. Write a program that calculates and
prints the amount of money you would have after t years if you invested P dollars
at an annual interest rate r (compounded continuously). The desired value is given
by the formula <i>Pe^<bold>rt<bold/></i>.
**/
public class CompoundedInterest {
    public static void main(String[] args) {
        double r = (2.0/100); // Interest
        double P = 500; //Dollars we got.
        int t = 5; // Years
        double e = (1 + r);
        System.out.println("Money you invest "+P+"$ in every year for "+t+" years " +
                "with an interest of "+(r*100)+"% " +
                "they will be at the end: "+ Math.round(P * Math.pow(e,t))+"$");
    }
}