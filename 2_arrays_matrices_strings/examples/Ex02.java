import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int[] a = enter();
        print1(a);
        print2(a);
    }
    
    static void print1(int[] a) {
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    
    static void print2(int[] a) {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    static int[] enter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        
        System.out.println("Enter arrays elements:");
        int[] tmp = new int[n];
        for(int i=0; i<n; i++)
            tmp[i] = sc.nextInt();
            
        return tmp;
    }
}
