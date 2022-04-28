package Buoi_1;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();

        float sum = 0.0f;
        for (int i = 1; i <= n; i++) {
            sum += (float) 1 / i;
        }

        System.out.printf("Sum is: %.2f", sum);
    }
}
