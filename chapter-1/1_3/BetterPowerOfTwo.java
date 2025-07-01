public class BetterPowerOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 0, pow = 0;
        // In this case, we will check if the value of pow is bigger than 2^31-1
        while(i < n && pow < Integer.MAX_VALUE){
            pow = (int) Math.pow(2,i);
            System.out.println(i + " " + pow);
            i++;
        }
    }
}