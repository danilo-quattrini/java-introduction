/**<h1>1.3.23 Gambler v2.0</h1>
 * Write a version of Gambler that uses two nested while loops or two nested
 * for loops instead of a while loop inside a for loop.
 * **/
public class GamblerV2 {
    public static void main(String[] args) {
        double stake = Double.parseDouble(args[0]); // Initial amount of money we got
        double goal = Double.parseDouble(args[1]); // The goal we want to reach at the end
        int trials = Integer.parseInt(args[2]); // The goal we want to reach at the end
        int bets = 0; // numbers of bets the gambler did during the game
        int t = 0;
        int wins = 0;
        while (t < trials) {
            double cash = stake;
            // You are continuing betting until going broke or reaching $goal cash == 0 or cash >= goal
            while (cash > 0.0 && cash <= goal){
                bets++; // We start our bets to say that we are betting 1$
                if(Math.random() < 0.5) cash++;
                else                    cash--;
            }
            t++;
            if(cash >= goal) wins++;
        }
        System.out.println("Percentage of wins " + (double)(100*wins)/trials + "%");
        System.out.println("Average of bets: " + bets/trials);
    }
}