public class DeckGenerator {
    public static void main(String[] args) {
        // We defined our suits and ranks for our deck
        String[] SUITS = {"Clubs", "Hearts", "Spades", "Diamonds"};
        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "Aces",
                "Queen", "King", "Jack"
        };
        // We generate a random card from our deck by using the Math.random() function
        int i = (int) (Math.random()  * SUITS.length);
        int j = (int) (Math.random()  * RANKS.length);
        System.out.println("The card is a " + RANKS[j] + " of " + SUITS[i]);
        // Now we create the amount of card we got in our deck by multiplies the SUITS and the RANKS
        String[] DECK = new String[SUITS.length * RANKS.length];
        for (int k = 0; k < RANKS.length; k++)
            for (int l = 0; l < SUITS.length; l++)
                DECK[SUITS.length * k + l] = RANKS[k] + " of " + SUITS[l];

        for (int k = 0; k < DECK.length; k++) {
            System.out.println(DECK[k]);
        }
        // Exchange the values inside the array
        System.out.println("\nSwitching values inside the array\n");
        System.out.println("Card: " + DECK[1] + " And " + DECK[2]);
        String temp = DECK[1];
        DECK[1] = DECK[2];
        DECK[2] = temp;
        System.out.println("Card: " + DECK[1] + " And " + DECK[2]);

        /**
         * Shuffle card inside the deck
         * - We are gonna check the deck before and after the exchange
         * - We use the Math.random() function to equally choose the card to exchange
         * - At the end we see the result
         * **/
        System.out.println("Before the exchange");
        for (int k = 0; k < DECK.length; k++) {
            System.out.println(DECK[k]);
        }
        int n = DECK.length;
        for (int k = 0; k < n; k++) {
            // Random index we are going to use to choose the card we want to exchange randomly
            int r = (int) (Math.random() * (n - 1));
            String temp2 = DECK[k];
            DECK[k] = DECK[r];
            DECK[r] = temp2;
        }
        System.out.println("\n-------------\nAfter the exchange\n-------------\n");
        for (int k = 0; k < DECK.length; k++) {
            System.out.println(DECK[k]);
        }

    }
}