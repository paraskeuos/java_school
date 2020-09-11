package examples;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        System.out.println("Enter an integer:");
        if(sc.hasNextInt()) {
            x = sc.nextInt();
            System.out.println("You entered: " + x);
        } else {
            System.out.println("You didn't enter a number. Bye.");
            System.exit(1);
        }

        double y = 0.0;
        System.out.println("Enter a floating point number:");
        if(sc.hasNextDouble()) {
            y = sc.nextDouble();
            System.out.println("You entered: " + y);
        } else {
            System.out.println("You didn't enter a decimal number. Bye");
        }

        sc.close();
    }
}
