public class SelfAvoidingWalk {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[][] map = new boolean[n][n];
        boolean[][] dog = new boolean[n][n];
        boolean win = false;
        // Place the dog in the middle of the map
        int x = n / 2; int y = n / 2;
        while(x > 0 && x < n - 1 && y > 0 && y < n -1) {
            // We place the dog in the middle of the map in the first iteration
            // Then when we increment the x or the y we place in the new place the poistion to true
            dog [x][y] = true;
            /**
             * Check if the dog exits from the map or not
             * • if is outside in the north or south side (shown with dog[x + 1][y] and dog[x - 1][y])
             * • same thing as we said before but with the east and west side (shown with dog[x][y + 1] and dog[x][y - 1])
             * **/
            if(dog[x + 1][y] && dog[x - 1][y] && dog[x][y + 1] && dog[x][y - 1]){
                win = true;
                break;
            }
            // Randomize the place where we want that the dog go
            double r = Math.random();
            if (r < 0.25) { if (!dog[x+1][y]) x++; } // go up
            else if (r < 0.50) { if (!dog[x-1][y]) x--; } // go down
            else if (r < 0.75) { if (!dog[x][y+1]) y++; } // go right
            else { if (!dog[x][y-1]) y--; } // go left
        }
        /**
         * Place the dog in the map
         * • We check if the values of the map.
         * • If we found the place where the values is differently from the dog.
         * • Then we save the place of the dog in the middle.
         * • Otherwise we unchange the values inside the matrix map.
         * **/
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j] != dog[i][j]) {
                    System.out.print(" - ");
                    map[i][j] = dog[i][j];
                }else System.out.print(" * ");
            }
            System.out.println();
        }
        if(win)System.out.println("You won");
        else System.out.println("You lose");
    }
}