package examples;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, x = sc.nextInt();
        while(x != 0) {
            sum += x;
            x = sc.nextInt();
        }

        sc.close();

        System.out.println("Sum: " + sum);
    }
}
