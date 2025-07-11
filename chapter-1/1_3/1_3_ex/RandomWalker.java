/**<h1>1.3.37 2D random walk.</h1>
 * 2D random walk. A two-dimensional random walk simulates the behavior
 * of a particle moving in a grid of points. At each step, the random walker moves
 * north, south, east, or west with probability equal to 1/4, independent of previous
 * moves. Write a program RandomWalker that takes an integer command-line argu-
 * ment n and estimates how long it will take a random walker to hit the boundary of
 * a 2n-by-2n square centered at the starting point.
 * **/
public class RandomWalker {
    public static void main(String[] args) {
        int n  = Integer.parseInt(args[0]);
        int x = 0, y = 0;
        int moves = 0;
        System.out.println("Start: ["+ x + "," + y +"]\n");
        while (Math.abs(x) < n && Math.abs(y) < n){
            double stepValue = Math.random();
            if (stepValue < 0.25) x++; // right
            else if(stepValue < 0.5) x--; // left
            else if(stepValue < 0.75) y++; // up
            else y--; // down
            moves++;
            System.out.print("["+ x + "," + y +"]");
            if(moves % 10 == 0) System.out.println();
        }
        System.out.println("\n\n" + moves + " moves to reach the boundary of the square");
    }
}