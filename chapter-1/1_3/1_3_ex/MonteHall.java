/**<h1>1.3.42 Game simulation</h1>
 *  In the game show <i>Let’s Make a Deal</i>, a contestant is presented with three doors.
 * Behind one of them is a valuable prize. After the contestant
 * chooses a door, the host opens one of the other two doors (never revealing the prize,
 * of course). The contestant is then given the opportunity to switch to the other
 * unopened door. Should the contestant do so? Intuitively, it might seem that the
 * contestant’s initial choice door and the other unopened door are equally likely to
 * contain the prize, so there would be no incentive to switch. Write a program MonteHall
 * to test this intuition by simulation. Your program should take a commandline
 * argument n, play the game n times using each of the two strategies (switch or
 * do not switch), and print the chance of success for each of the two strategies.
 * **/
public class MonteHall {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
        int winCounter = 0;
        // NO - switching version.
        for (int i = 1; i <= trials ; i++) {
            // The random choice the contestant will do
            int choice =  1 + (int) (Math.random() * 3);
            // Assign each time a random value that's the winner door
            int winDoor = 1 + (int) (Math.random() * 3);
            if(choice == winDoor) winCounter++;
        }
        // Switch version
        int switchWinCounter = 0;
        for (int i = 1; i <= trials ; i++) {
            int choice = 1 + (int) (Math.random() * 3);
            int winDoor = 1 + (int) (Math.random() * 3);
            if (choice != winDoor) switchWinCounter++; // Because switch = win if initial was wrong
        }
        double winProbability =  ((double) winCounter / trials);
        System.out.printf("The winning probability of the game is about of: %.2f%%, with %d trials\n", winProbability * 100, trials);
        double winSwitchingProbability =  ((double) switchWinCounter / trials);
        System.out.printf("The winning probability of the game is with the switching is about of: %.2f%%, with %d trials\n", winSwitchingProbability * 100, trials);

    }
}