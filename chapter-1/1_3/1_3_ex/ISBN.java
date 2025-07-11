/**<h1>1.3.35 ISBN Calculator</h1>
 * The International Standard Book Number (ISBN) is a 10-digit
 * code that uniquely specifies a book. The rightmost digit is a checksum digit that
 * can be uniquely determined from the other 9 digits
 * **/
public class ISBN {
    public static void main(String[] args) {
        // The 9-digit number we want to compute the checksum
        String ISBN = args[0];
        // Check if the number contains more than 9 digits n % (1*10^9)
        if(ISBN.length() != 9){
            System.out.println("The number more than 9-digits or is less than 9 digits!");
            return;
        }
        int n = Integer.parseInt(ISBN);
        int sum = 0;
        for (int i = 2; i <= 9; i++) {
            int d = n % 10;
            n = (n - d) / 10;
            sum += i * d;
        }
        // Try all possible values for checksum
        for (int x = 0; x <= 10; x++) {
            int total = sum + x;
            if (total % 11 == 0) {
                ISBN += (x == 10 ? "X" : x);
                System.out.println("Checksum: " + (x == 10 ? "X" : x));
                System.out.println("ISBN: " + ISBN);
                return;
            }
        }
    }
}