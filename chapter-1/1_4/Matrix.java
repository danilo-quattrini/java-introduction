public class Matrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        double[][] table = new double[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                table[i][j] = (int)(20.0 + Math.random() * (100 - 20));
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        // Now we are going to do the average of the columns and rows values
        for (int i = 0; i < n*5; i++) System.out.print("-");
        System.out.println();
        for (int i = 0; i < m; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum += table[i][j];
            }
            // In this case we are doing the avarage of each column
            table[i][m] = sum / m;
            System.out.print(table[i][m] + " ");
        }
        // This is the row average in this case we invert i and j
        for (int j = 0; j < n; j++) {
            double sum = 0.0;
            for (int i = 0; i < m; i++) {
                sum += table[i][j];
            }
            table[n][j] = sum / m;
        }

    }
}