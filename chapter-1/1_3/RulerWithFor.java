/**<h1>1.2.1 Ruler with FOR-CYCLE</h1>
 * In this program we are printing the ruler that was in the previous exercise,
 * but in this case we use the For-cycle to print the numbers in between of them.
 * */
public class RulerWithFor {
    public static void main(String[] args) {
        int n = 5;
        String ruler = " 1 ";
        for (int i = 2; i <= n; i++) {
            System.out.println(ruler);
            ruler += i + ruler;
        }
    }
}