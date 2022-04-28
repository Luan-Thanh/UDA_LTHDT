package Buoi_1;

import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();

        int x = 1;
        double t, sum = 0;
        while (x <= n) {
            t = 1;
            for (int i = 1; i <= x; i++) {
                t = t * i;
            }
            sum = sum + (x / t);
            x++;
        }
        System.out.println("Sum is: " + sum);
    }
}
