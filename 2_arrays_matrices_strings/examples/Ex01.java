package examples;

import java.util.Scanner;

public class Ex01 {
    static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        print("Enter " + n + " numbers:");
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        print("Entered (for loop):");
        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");
        print("");

        print("Entered (foreach loop):");
        for(int e : a)
            System.out.print(e + " ");
    }
}
