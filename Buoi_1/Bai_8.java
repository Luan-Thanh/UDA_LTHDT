package Buoi_1;

import java.util.Scanner;

public class Bai_8 {

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count + 1;
            }
        }
        if (count == 2) {
            System.out.println(n + " is prime");

        } else {
            System.out.println(n + " is NOT prime");
        }

    }
}
