/**<h1>Program 1.3.8 Gambler’s ruin simulation</h1>
 * This program takes three integers command-line arguments stake, goal, and trials. The
 * inner while loop in this program simulates a gambler with $stake who makes a series of $1
 * bets, continuing until going broke or reaching $goal. The running time of this program is
 * proportional to trials times the average number of bets. For example, the third command below
 * causes nearly 100 million random numbers to be generated
 * **/
public class Gambler {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]); // Initial amount of money we want to bet
        int goal = Integer.parseInt(args[1]); // The goal we want to reach with the money we have
        int trials = Integer.parseInt(args[2]); // How many trials we want to reach that amount of money
        int win = 0; // if we won is 1 meanwhile 0 we lose;
        int bets = 0; // How many times we are going to play in this game
        for(int t = 0; t < trials; t++){
            // cash we got at the end of all the trials
            int cash = stake;
            // If we lose all the money, or we pass the goal, we are going to finish the while cycle
            while (cash > 0 && cash < goal){
                // We increment the variable bets to show that we are doing the action of "bet"
                bets++;
                // We randomize the change of win or lose with Math.random() < 0.5
                if (Math.random() < 0.5) cash++;
                else cash--;
                // System.out.print(" " + cash);
            }
            // if we reach the goal with the amount of cash we got from the gamble, we increment the variable win
            if(cash == goal) win++;
        }
        System.out.println();
        System.out.println("Bet: " + bets + "$");
        System.out.println(100*win/trials + "% of winning");
        System.out.println("Avg of bets " + bets/trials);

    }
}