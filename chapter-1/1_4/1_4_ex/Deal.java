/**** <h1>1.4.10 Deal</h1>
 * Write a program Deal that takes an integer command-line argument n and
 * prints n poker hands (five cards each) from a shuffled deck, separated by blank line
 */
public class Deal {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        // The hand the user got from the hand
        String[] hand = new String[n];
        // Ranks and Suits for the deck
        String[] SUITS = {"Clubs", "Hearts", "Spades", "Diamonds"};
        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "Aces",
                "Queen", "King", "Jack"
        };
        // Generate the deck we want to use
        String[] DECK = new String[SUITS.length * RANKS.length];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                DECK[SUITS.length  * i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }
        // Shuffle the deck we generated
        for (int i = 0; i < DECK.length; i++) {
            int k = (int) (Math.random() * (DECK.length - 1));
            String temp = DECK[i];
            DECK[i] = DECK[k];
            DECK[k] = temp;
        }
        // Simulate the draw from the deck with the first five card
        for (int i = 0; i < hand.length; i++) hand[i] = DECK[i];
        // Take the first n card from the deck
        System.out.println("Your hand from the deck");
        for(String card: hand){
            System.out.println(card);
        }
    }
}