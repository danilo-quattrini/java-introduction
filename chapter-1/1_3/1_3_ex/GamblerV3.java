/**<h1>1.3.25-26 Gambler V3</h1>
 * Modify Gambler to take an extra command-line argument that specifies
 * the (fixed) probability that the gambler wins each bet. Use your program to try to
 * learn how this probability affects the chance of winning and the expected number
 * of bets. Try a value of p close to 0.5 (say, 0.48).
 *
 * Modify Gambler to take an extra command-line argument that specifies
 * the number of bets the gambler is willing to make, so that there are three possible
 * ways for the game to end: the gambler wins, loses, or runs out of time. Add to the
 * output to give the expected amount of money the gambler will have when the game
 * ends. Extra credit: Use your program to plan your next trip to Monte Carlo
 * **/
public class GamblerV3 {
    public static void main(String[] args) {
        double stake = Double.parseDouble(args[0]); // Initial amount we are going to the casino
        double goal = Double.parseDouble(args[1]); // The goal we want to reach after the amount of trial
        int trials = Integer.parseInt(args[2]); // Numbers of trials we want to play to reach the goal
        double probability = Double.parseDouble(args[3]); // The probability we insert and decide to handle the game
        int bets = Integer.parseInt(args[4]); // Numbers of Bets we want to win the game
        int wins = 0; //Times of win that the player made during the game.
        int loses = 0;
        double totalCashAmount = 0.0;
        if (probability < 0.0 || probability > 1.0){
            System.out.println("The probability that you insert isn't correct");
            return;
        }
        for (int t = 0; t < trials ; t++) {
            double cash = stake; // Defined the amount of money we start to play each game
            int betsInGame = bets; // Define the amount of betting we are doing in each trial
            while (cash > 0 && cash < goal && betsInGame > 0){
                betsInGame--;
                // Here is the part where we decide the probability.
                if (Math.random() < probability) cash++; // if is near to 1.0 we have more chance to win
                else cash--; // else we are losing more if it's less than 0.5
                // Print the amount of cash with the "*"
                for (int i = 0; i < (int) cash; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if(cash >= goal) wins++;
            else if (cash <= 0) loses++;
            totalCashAmount += cash;
        }
        System.out.println("\n--- Simulation Results ---");
        System.out.println("Average of money at the end of the game: " + totalCashAmount/trials + "$");
        System.out.println("Percentage of win is: " + (double)( 100 * wins ) / trials + "%");
        System.out.println("Average of bets: " + bets/trials);
        System.out.println("Numbers of loses: " + loses);
        System.out.println("Numbers of wins: " + wins);
    }
}