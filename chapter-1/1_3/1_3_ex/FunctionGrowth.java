/** <h1>1.3.12 Function Growth</h1>
 * Write a program FunctionGrowth that prints a table of the values log n, n,n loge n, n 2, n 3
 * , and 2 n for n = 16, 32, 64, ..., 2,048. Use tabs (\t characters) to align
 * columns.
 * **/
public class FunctionGrowth {
    public static void main(String[] args) {
        System.out.println("Log(n)\tn\tnLog(e)n\tn^2\tn^3\t2^n");
        for (int n = 16; n <= 2048; n*=2) {
            System.out.print(Math.log10(n)+"\t");
            System.out.print(n+"\t");
            System.out.print(n*(Math.log(n))+"\t");
            System.out.print(Math.pow(n,2.0)+"\t");
            System.out.print(Math.pow(n,3.0)+"\t");
            System.out.print(Math.pow(2,n)+"\t");
            System.out.println();
        }
    }
}