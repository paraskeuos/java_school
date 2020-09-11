package examples;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = 'x';
        if(sc.hasNext()) {
            String tmp = sc.next();
            x = tmp.charAt(0);
        } else {
            System.out.println("Error, you didn't enter string or character");
            System.exit(1);
        }

        System.out.println("Entered: " + x);
        if(Character.isUpperCase(x)) {
            System.out.println(x + " is uppercase.");
            System.out.println("Lowercase: " + Character.toLowerCase(x));
        } else if(Character.isLowerCase(x)) {
            System.out.println(x + " is lowercase.");
            System.out.println("Uppercase: " + Character.toUpperCase(x));
        } else if(Character.isDigit(x)) {
            System.out.println(x + " is a digit");
            System.out.println("Integer value: " + Character.getNumericValue(x));
        }

        sc.close();
    }
}
