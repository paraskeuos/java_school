package examples;

public class Ex03 {
    static int add(int x, int y) {
        return x + y;
    }

    static void print(int x, int y) {
        System.out.printf("%d + %d = %d\n", x, y, add(x,y));
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = add(a,b);

        System.out.println(c);
        System.out.println(a + " + " + b + " = " + c);
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " + " + b + " = " + add(a,b));

        System.out.printf("%d + %d = %d\n", a, b, (a+b));
        System.out.format("%d + %d = %d\n", a, b, add(a,b));
        print(a,b);
    }
}
