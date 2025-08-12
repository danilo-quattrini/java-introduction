/**<h1>Matrix Multiplication</h1>
 * The matrix multiplication is the operation that involves to:
 * • Take the rows from the first matrix;
 * • Take the column of the second matrix;
 * • Multiply each element inside the row with each element of the column;
 * • The result of the operation will be save inside the third matrix;
 * */
public class MatrixMolt {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        // We create our two matrices where we are going to do the sum
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int[][] c = new int[n][m]; // In this one we save our result of the operation
        // We initialize the values inside the matrix a
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
                b[i][j] = (int) (Math.random() * 10);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // With this k we define that we are point to the row of a and the column of b
                for (int k = 0; k < n; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }
        // Print the matrix and their result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\t");
            if(i == (n / 2)) System.out.print(" * ");
            System.out.print("\t");
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\t");
            if(i == (n / 2)) System.out.print(" = ");
            System.out.print("\t");
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}