/**<h1>1.3.34 Ramanujan’s taxi.</h1>
 * 1.3.34 Ramanujan’s taxi. Srinivasa Ramanujan was an Indian mathematician
 * who became famous for his intuition for numbers. When the English mathemati-
 * cian G. H. Hardy came to visit him one day, Hardy remarked that the number of
 * his taxi was 1729, a rather dull number. To which Ramanujan replied, “No, Hardy!
 * No, Hardy! It is a very interesting number. It is the smallest number expressible as
 * the sum of two cubes in two different ways.” Verify this claim by writing a program
 * that takes an integer command-line argument n and prints all integers less than or
 * equal to n that can be expressed as the sum of two cubes in two different ways.
 * **/
public class Ramanujan {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int a = 1; a * a * a <= n; a++) {
            int a3 = a * a * a;
            for (int b = 1; a3 + b * b * b <= n ; b++) {
                int b3 = b * b * b;
                int sum = a3 + b3;
                for (int c = 1; c * c * c <= n ; c++) {
                    int c3 = c * c * c;
                    for (int d = 1; c3 + d * d * d <= n ; d++) {
                        int d3 = d * d * d;
                        // Check if (a,b) and (c,d) are different to each other
                        if((a != c || b != d) && (a != d || b != c)){
                            if ((c3 + d3) == sum && a <= b && c <= d) {
                                System.out.println("[(" + a + "," + b + "),(" + c + "," + d + ")]: " + sum);
                            }
                        }
                    }
                }
            }
        }
    }
}