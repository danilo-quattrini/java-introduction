public  class IntOper{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        int div = a / b;
        int molt = a * b;
        int mod = a % b;
        System.out.println("a:"+ a +" + b:"+ b + "= "+ sum);
        System.out.println("a:"+ a +" + b:"+ b + "= "+ div);
        System.out.println("a:"+ a +" + b:"+ b + "= "+ molt);
        System.out.println("a:"+ a +" + b:"+ b + "= "+ mod);
    }
}