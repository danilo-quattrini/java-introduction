import javax.swing.plaf.synth.SynthOptionPaneUI;

class BooleansOp{
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        // The meaning of the condition are  !(a && b) = true
        System.out.println(((!(a && b) && (a || b)) || ((a && b) || !(a || b))));

        // 1.2.4 Suppose that a and b are int variables. Simplify the following expression:
        // (!(a < b) && !(a > b)).
        int a2 = 5;
        int b2 = 5;
        System.out.println(!(a2 < b2) && !(a2 > b2));

        //1.2.5 The exclusive or operator ^ for boolean operands is defined to be true if
        //they are different, false if they are the same. Give a truth table for this function.
        // A B  A ^ B
        // v f  V
        // v f  V
        // f v  V
        // f v  V

        // Why does 10/3 give 3 and not 3.333333333? Because both of them are integer
        System.out.println("10 : 3 with integers: " + (10 / 3));
        System.out.println("10 : 3 with doubles: " + (10.0 / 3));

        System.out.println(2 + "bc"); // fist int then char
        System.out.println(2 + 3 + "bc"); // first the sum for 2 + 3 and then the string
        System.out.println((2 + 3) + "bc"); // same thing but first parentheses then the string
        System.out.println("bc" + 2 + 3); // convert 2 and 3 into a string(char) primitive
        System.out.println("bc" + (2 + 3));

        System.out.println('b'); // just print the char value of 'b'
        System.out.println('b' + 'c'); // when they see a sum they convert the values of 'b' and 'c' into integers
        System.out.println((char) ('a' + 4)); // converting the sum of 'a' + 4 in this way they just shift into the  ASCII table from a = 97 + 4 = 101 = e

        //1.2.10 Suppose that a variable a is declared as int a = 2147483647
        // (or equiva-lently, Integer.MAX_VALUE). What does each of the following print?
        int max = Integer.MAX_VALUE;
        System.out.println("a:" + max);
        System.out.println("a+1:" + (max+1));
        System.out.println("2-a: " + (2 - max));
        System.out.println("-2-a: " + (-2 -max));
        System.out.println("2*a: " + (2 * max));
        System.out.println("4*a: " + (4 * max));

        //1.2.11 Suppose that a variable a is declared as double a = 3.14159. What does
        //each of the following print?
        double phi = Math.PI;
        System.out.println(phi);
        System.out.println(phi+1);
        System.out.println(8 / (int)phi);
        System.out.println(8 / phi);
        System.out.println((int)(8 / phi));

        // 1.2.13 Evaluate the expression (Math.sqrt(2) * Math.sqrt(2) == 2).
        System.out.println(Math.sqrt(2) * Math.sqrt(2) == 2);
        // 1.2.17 Give the value of the variable a after the execution of each of the following
        //sequences of statements:
        //int a = 1; a = a + a; a = a + a; a = a + a; boolean a = true; a = !a; a = !a; a = !a; int a = 2;
        //a = a * a;
        //a = a * a;
        //a = a * a;
        int a3 = 1;
        a3 = a3 + a3;
        a3 = a3 + a3;
        a3 = a3 + a3;
        System.out.println(a3);
        int a4 = 2;
        a4 = a4 * a4;
        System.out.println(a4);
        a4 = a4 * a4;
        System.out.println(a4);
        a4 = a4 * a4;
        System.out.println(a4);
    }
}