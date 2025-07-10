/**<h1>Factors V1 </h1>
 * 1.3.27 Modify Factors to print just one copy each of the prime divisors.
 * **/
public class FactorsV1 {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        long primeDivisors = 0;
        long startTime = System.nanoTime();
        System.out.println("factor\tn\tsingle prime\toutput");
        for (long factor = 2; factor <= n/factor; factor++){
            System.out.print(factor + "\t");
            System.out.print(n + "\t");
            while (n % factor == 0){
                n /= factor; // Factor is a divisor of n so we divide factor for n to decrease its value
                if(primeDivisors != factor){
                    primeDivisors = factor;
                    System.out.print("\t" + primeDivisors + "\t");
                }
                System.out.print("\t" + factor + " ");
            }
            System.out.println();
        }
        if(n > 1) System.out.print(n);
        System.out.println();
        long endTime = System.nanoTime();
        System.out.println((endTime-startTime)*1e-9);
    }
}