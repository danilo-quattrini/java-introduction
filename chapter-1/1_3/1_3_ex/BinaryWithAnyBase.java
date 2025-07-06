/**<h1>1.3.21 Binary with i and k base</h1>
 * Modify Binary to get a program Kary that takes two integer command-
 * line arguments i and k and converts i to base k. Assume that i is an integer in Java’s
 * long data type and that k is an integer between 2 and 16. For bases greater than 10,
 * use the letters A through F to represent the 11th through 16th digits, respectively.
 * **/
public class BinaryWithAnyBase {
    public static void main(String[] args) {
        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);
        String result = "";
        if(k >= 2 && k <= 16){
            int pow = 1;
            while (pow <= (i / k))
                pow *= k;
            while (pow > 0) {
                long digit = i / pow; // we save the reminder of the result of the division
                i = i % pow; // then we reduce the dimension of i
                pow /= k; // we reduce the weight of pow in this case we work on the next weight
                if (digit < 10)
                    result += (digit);
                else
                    result += (char)('A' + (digit - 10)); // 'A' = 65 + (10 - 10), so it's A or the successors.
            }
            System.out.println(result);

        }else System.out.println("Convert only base between 2 to 16 not greater or less than them");
    }
}