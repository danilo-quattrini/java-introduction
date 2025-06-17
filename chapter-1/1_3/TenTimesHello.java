/**<h1>Program 1.3.2 Your first while loop</h1>
 * This program uses a while loop for the simple, repetitive task of printing the output shown
 * below. After the third line, the lines to be printed differ only in the value of the index counting
 * the line printed, so we define a variable i to contain that index. After initializing the value of
 * i to 4, we enter into a while loop where we use the value of i in the System.out.println()
 * statement and increment it each time through the loop. After printing 10th Hello, the value
 * of i becomes 11 and the loop terminates.
 * */
public class TenTimesHello {
    public static void main(String[] args) {
        System.out.println("1th Hello World!");
        System.out.println("2th Hello World!");
        System.out.println("3th Hello World!");
        int i = 4;
        while (i <= 10){
            System.out.println(i + "th Hello, World!");
            i++;
        }
    }
}
