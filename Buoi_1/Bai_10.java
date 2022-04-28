package Buoi_1;

import java.util.Scanner;

public class Bai_10 {
    public static void main(String[] args) {
        int f0 = 0, f1 = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();

        System.out.print("Fibonacci with " + n + " numbers are: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(f0 + " ");
            int sum = f0 + f1;
            f0 = f1;
            f1 = sum;
        }
    }
}
