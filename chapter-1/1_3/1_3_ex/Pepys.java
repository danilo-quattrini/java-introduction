/**<h1>1.3.41 Pepy's Problem</h1>
 * In 1693 Samuel Pepys asked Isaac Newton which is more
 * likely: getting 1 at least once when rolling a fair die six times or getting 1 at least
 * twice when rolling it 12 times. Write a program that could have provided Newton
 * with a quick answer.
 * **/
public class Pepys {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
        int dice  = 6;
        double probability = 1.0 / dice;
        double sixWinRate, twelveWinRate;
        int sixWin = 0, twelveWins = 0;
        for (int i = 1; i <= trials; i++) {
            int count = 0;
            // Trial with 6 dices
            for (int j = 1; j <= dice; j++) if (Math.random() < probability) count++;
            if (count >= 1) sixWin++;
            // Trial with 12 dices
            count = 0;
            for (int j = 1; j <= dice * 2; j++) if (Math.random() < probability) count++;
            if (count >= 2) twelveWins++;
        }
        sixWinRate = (double) sixWin / trials;
        System.out.println("Probability to get 1's in 6 dices are: " + sixWinRate + "%");
        twelveWinRate = (double) twelveWins /trials;
        System.out.println("Probability to get two 1's in 12 dices are: " + twelveWinRate + "%");
    }
}