package examples;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int x = sc.nextInt();
        System.out.println(("You entered: " + x));

        System.out.println("Enter a floating point number:");
        double y = sc.nextDouble();
        System.out.println("You entered: " + y);

        System.out.println("Enter a word:");
        String word = sc.next();
        System.out.println("You entered: " + word);

        System.out.println("Enter 1 character: ");
        String tmp = sc.next();
        char z = tmp.charAt(0);
        System.out.println("You entered: " + z);

        sc.close();
    }
}
