/**<h1>Program 1.3.1 Flipping a fair coin</h1>
 * This program uses Math.random() to simulate a fair coin flip. Each time you run it, it prints
 * either Heads or Tails. A sequence of flips will have many of the same properties as a sequence
 * that you would get by flipping a fair coin, but it is not a truly random sequence.
 * **/
public class FlipCoin {
    public static void main(String[] args) {
        if(Math.random() < 0.5) System.out.println("Head");
        else                    System.out.println("Tail");
    }
}