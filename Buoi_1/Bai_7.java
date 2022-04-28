package Buoi_1;

import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();

        int sum = 0;
        if (n > 0)
            for (int i = 1; i <= n; i++)
                sum += i;
        else
            System.out.println("ERROR!!");

        System.out.println("Sum > 0 is " + sum);
    }
}
