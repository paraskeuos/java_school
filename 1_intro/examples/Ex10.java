package examples;

import java.util.Scanner;

public class Ex10 {
    static double toDegrees(double radians) {
        return (radians*180)/Math.PI;
    }

    static double toRadians(double degrees) {
        return (degrees*Math.PI)/180;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter angle in degrees:");
        double alpha = sc.nextDouble();

        alpha = toRadians(alpha);

        System.out.println("Angle in radians: " + alpha);
        System.out.printf("sin(%g) = %g\n", alpha, Math.sin(alpha));
        System.out.printf("cos(%g) = %g\n", alpha, Math.cos(alpha));
        System.out.printf("tg(%g) = %g\n", alpha, Math.tan(alpha));
        System.out.printf("ctg(%g) = %g\n", alpha, 1/Math.tan(alpha));

        System.out.println("Enter angle in radians:");
        alpha = sc.nextDouble();

        System.out.println("Angle in radians: " + alpha);
        System.out.println("Angle in degrees: " + toDegrees(alpha));
        System.out.printf("sin(%g) = %g\n", alpha, Math.sin(alpha));
        System.out.printf("cos(%g) = %g\n", alpha, Math.cos(alpha));
        System.out.printf("tg(%g) = %g\n", alpha, Math.tan(alpha));
        System.out.printf("ctg(%g) = %g\n", alpha, 1/Math.tan(alpha));

        System.out.println("Enter real number:");
        double x = sc.nextDouble();
        System.out.printf("sqrt(%g^3) = %g\n", x, Math.sqrt(Math.pow(x, 3)));

        sc.close();
    }
}
