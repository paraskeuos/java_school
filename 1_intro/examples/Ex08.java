package examples;

import java.util.Scanner;

public class Ex08 {
    static int fibonacciIter(int n) {
        if(n == 1 || n == 2)
            return 1;
        int prev = 1, curr = 1;
        for(int i=3; i<=n; i++) {
            int tmp = curr;
            curr = prev + curr;
            prev = tmp;
        }

        return curr;
    }

    static int fibonacciRecursive(int n) {
        if(n==1 || n==2)
            return 1;

        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        System.out.println("fib(" + n + ") = " + fibonacciRecursive(n));
        System.out.println("fib(" + n + ") = " + fibonacciIter(n));
        sc.close();
    }
}
