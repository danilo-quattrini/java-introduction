/**<h1>1.3.45 Chaos</h1>
 * Write a program to study the following simple model for popula-
 tion growth, which might be applied to study fish in a pond, bacteria in a test tube,
 or any of a host of similar situations. We suppose that the population ranges from
 0 (extinct) to 1 (maximum population that can be sustained). If the population at
 time t is x, then we suppose the population at time t + 1 to be r x (1 x), where the
 argument r, known as the fecundity parameter, controls the rate of growth. Start
 with a small population—say, x = 0.01—and study the result of iterating the mod-
 el, for various values of r. For which values of r does the population stabilize at
 x = 1 1/r ? Can you say anything about the population when r is 3.5? 3.8? 5?
 * **/
public class Chaos {
    public static void main(String[] args) {
        // It's the fecundity parameter we are going to use inside our formula
        double r = Double.parseDouble(args[0]);
        // Population range that is from 0 (extinct) to 1 that's (maximum population)
        double x = 0.01;
        System.out.println("Fecundity rate is: " + r);
        // We are simulating the time passing with the while-loop and a variable t;
        int t = 1;
        while(Math.abs(x - (1 - 1/r)) > 0.000001) {
            System.out.println("At time " + t + " the population is of: " + x);
            x = r * x * (1 - x);
            t++;
        }
    }
}