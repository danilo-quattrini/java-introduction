/**<h1>1.3.5 Roll-Loaded Dice</h1>
 * Write a program RollLoadedDie that prints the result of rolling a loaded
 * die such that the probability of getting a 1, 2, 3, 4, or 5 is 1/8 and the probability of
 * getting a 6 is 3/8.
 * **/
public class RollLoadedDice {
    public static void main(String[] args) {
        // give a result within 0.0 to 1.0
        double roll = Math.random();
        int result;
        if (roll < 1.0/8.0) result = 1;
        else if(roll < 2.0/8.0) result = 2;
        else if(roll < 3.0/8.0) result = 3;
        else if(roll < 4.0/8.0) result = 4;
        else if(roll < 5.0/8.0) result = 5;
        else result = 6;
        System.out.println(result);
    }
}
