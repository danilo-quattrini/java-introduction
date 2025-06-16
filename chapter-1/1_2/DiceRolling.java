public class DiceRolling {
    public static void main(String[] args) {
        int dice1, dice2;
        dice1 = dice2 = 6;
        dice1 = (1 + (int)(Math.random() * dice1));
        dice2 = (1 + (int)(Math.random() * dice2));
        System.out.println("Sum of dice1: " + dice1 + " and dice2: " + dice2 + " is: " + (dice1+dice2));
    }
}