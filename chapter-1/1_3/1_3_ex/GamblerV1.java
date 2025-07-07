/**<h1>1.3.24 Gambler V1</h1>
 * Write a program GamblerV1 that traces a gambler’s ruin simulation by
 * printing a line after each bet in which one asterisk corresponds to each dollar held
 * by the gambler.
 * **/
public class GamblerV1 {
    public static void main(String[] args) {
        double stake = Double.parseDouble(args[0]); // Initial amount we are going to the casino
        double goal = Double.parseDouble(args[1]); // The goal we want to reach after the amount of trial
        int trials = Integer.parseInt(args[2]); // Numbers of trials we want to play to reach the goal
        int bets = 0;
        int wins = 0;
        for (int t = 0; t < trials ; t++) {
            double cash = stake; // Defined the amount of money we start to play
            while (cash >= 0 && cash <= goal){
                bets++;
                if (Math.random() < 0.5) cash++;
                else cash--;
                for (int i = 0; i < cash; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if(cash == goal) wins++;
        }
        System.out.println("Percentage of win is: " + (double)( 100 * wins) / bets + "%");
        System.out.println("Average of bets: " + bets/trials);
    }
}