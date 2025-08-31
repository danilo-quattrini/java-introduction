public class bidimensionalAsterixs {
    public static void main(String[] args) {
        boolean[][] a = new boolean[10][10];
        char asterix = '*';
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(Math.random() < 0.50) a[i][j] = true;
                else a[i][j] = false;
            }
        }
        System.out.print(" ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            for (int j = 0; j < 10; j++) {
                if(a[i][j]) System.out.print(" " + asterix + " ");
                else System.out.print(" " + "-" + " ");
            }
            System.out.println();
        }

    }
}