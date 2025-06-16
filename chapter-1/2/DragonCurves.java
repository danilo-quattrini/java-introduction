/**<h1>1.2.35 Dragon curves.</h1>
 *  Write a program to print the instructions for drawing the
 dragon curves of order 0 through 5. The instructions are strings of F, L, and R
 characters, where F means “draw line while moving 1 unit
 forward,” L means “turn left,” and R means “turn right.” A
 dragon curve of order n is formed when you fold a strip
 of paper in half n times, then unfold to right angles. The
 key to solving this problem is to note that a curve of order
 n is a curve of order n 1 followed by an L followed by a
 curve of order n 1 traversed in reverse order, and then
 to figure out a similar description for the reverse curve.
 * **/
public class DragonCurves {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if(n < 0 || n > 5) return;
        else System.out.println(dragon(n));
    }
    public static String dragon(int n){
        if(n == 0) return "F";
        String prev = dragon(n - 1); // We are saving the previus value
        return prev + "L" +  reverseAndSwap(prev);
    }
    public static String reverseAndSwap(String s){
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == 'L') result += "R";
            else if (c == 'R') result += "L";
            else result += c;
        }
        return result;
    }
}