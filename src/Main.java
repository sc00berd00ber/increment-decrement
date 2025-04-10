public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y;
        x++; // adds 1 to x (x is now 6)
        ++x; // adds 1 to x (x is now 7)
        y = ++x; // adds 1 to x and then assigns c ot y
        // x is now 8 and u is 8
        x = 5;
        y = x++; // assigns x to y and then adds 1 to x
        // x is now 6 and y is 5
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int a = 10;
        //a = a * 10;
        a *= 10;
        System.out.println("a = " + a);

        int b = 0;
        b += 5;
        b += 5;
        b += 5;
        System.out.println("b = " + b);

        int c = 10;
        c /= 2;
        System.out.println("c = " + c);

        int d = 33;
        d -= 11;
        System.out.println("d = " + d);
    }
}