public class PrimeCounter {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 2; i <= n; i++) {
            if (((i % 2) != 0) && ((i % Math.sqrt(i)) != 0)){
                System.out.print(i + " ");
                if((i % 15) == 0) System.out.println();
            }
        }

    }
}