package examples;

import java.util.Scanner;

public class Ex07 {

    static void showEven(int n) {
        for(int i=2; i<=n; i+=2)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        showEven(n);
        sc.close();
    }
}
